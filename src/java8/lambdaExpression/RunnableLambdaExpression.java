package java8.lambdaExpression;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method called...");
    }
}

public class RunnableLambdaExpression {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("run method  called using lambda.."));
        thread1.start();
    }
}
