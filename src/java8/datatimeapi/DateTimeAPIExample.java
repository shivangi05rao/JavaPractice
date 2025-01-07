package java8.datatimeapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface DateTimeAPIExample {
    void start();

    default void stop() {
        System.out.println("Stop the vehicle...");
    }
}

class Car implements DateTimeAPIExample {

    @Override
    public void start() {
        System.out.println("Start the car..");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.stop();
    }
}

class LambdaEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(val -> val + 1);
    }

}
