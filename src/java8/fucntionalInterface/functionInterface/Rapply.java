package java8.fucntionalInterface.functionInterface;

import java.util.function.Function;

public class Rapply {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("String length: " + lengthFunction.apply("This is awesome!"));
    }
}
