package java8.functionalInterface.function;

import java.util.function.Function;

public class AndThen {
    public static void main(String[] args) {
        Function<Integer, Integer> add = x -> x + 10;
        Function<Integer, Integer> multiply = y -> y * 2;
        System.out.println("andThen result: " + add.andThen(multiply).apply(3));
    }
}
