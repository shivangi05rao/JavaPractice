package multithreading.concepts;

public class ThreadDaemon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
        }
    }

    public static void main(String[] args) {
        ThreadDaemon t1 = new ThreadDaemon();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main thread is running...");
    }
}
