package java8.functionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String>  printMessage = message -> System.out.println("Message " + message);
        printMessage.accept("Hello, Java 8!");

        Consumer<Integer> squareNumber = num -> System.out.println(num * num);
        squareNumber.accept(2);

        //Consumer Chaining
        Consumer<String> printMessage1 = message1 -> System.out.println("Message1 " + message1);
        printMessage1.accept("Hello! Java 8");

        Consumer<String> printMessage2 = message2 -> System.out.println("Message2 " + message2);
        printMessage2.accept("My name Shivangi!");

        printMessage1.andThen(printMessage2).accept("Chaining consumers");
    }
}
