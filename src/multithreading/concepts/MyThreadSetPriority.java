package multithreading.concepts;

public class MyThreadSetPriority extends Thread {
    public MyThreadSetPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + "- count: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        MyThreadSetPriority l = new MyThreadSetPriority("Low");
        MyThreadSetPriority m = new MyThreadSetPriority("Medium");
        MyThreadSetPriority h = new MyThreadSetPriority("High");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
