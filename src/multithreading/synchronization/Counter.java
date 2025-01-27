package multithreading.synchronization;

public class Counter {
    int count = 0;

    public synchronized void increment() { //Critical section
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadCounter t1 = new ThreadCounter(counter);
        ThreadCounter t2 = new ThreadCounter(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }
        System.out.println(counter.getCount());
    }
}

class ThreadCounter extends Thread {
    private  Counter counter;

    public ThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

}