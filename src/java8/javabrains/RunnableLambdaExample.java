package java8.javabrains;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing inside the runnable");
            }
        });
        myThread.run();

        Thread lambdaThread = new Thread(() -> System.out.println("Printing lambda runnable"));
        lambdaThread.run();
    }
}
