package java8.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bi {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> checkSumOfTwo = (a, b) -> a + b >= 5;
        System.out.println(checkSumOfTwo.test(2, 3));
        System.out.println(checkSumOfTwo.test(2, 1));

        BiFunction<Integer, Integer, Integer> multiplyBoth = (a, b) -> a * b;
        System.out.println(multiplyBoth.apply(2, 3));

        BiConsumer<String, Integer> message = (name , age) -> System.out.println(name + " is " + age + " years old.");
        message.accept("Alice", 24);
    }

}
