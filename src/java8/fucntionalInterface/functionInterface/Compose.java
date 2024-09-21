package java8.fucntionalInterface.functionInterface;

import java.util.function.Function;

public class Compose {
    public static void main(String[] args) {
        Function<Integer, Integer> increment = x -> x + 10;
        Function<Integer, Integer> multiply = y -> y * 2;
        System.out.println("Compose result: " + increment.compose(multiply).apply(3));
    }
}
