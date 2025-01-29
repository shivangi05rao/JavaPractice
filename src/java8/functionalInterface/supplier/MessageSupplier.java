package java8.functionalInterface.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class MessageSupplier {
    public static void main(String[] args) {
        Supplier<String> messageSupplier = () -> "Hello from Supplier";
        System.out.println(messageSupplier.get()); //Hello from Supplier

        //Random number Supplier
        Supplier<Integer> randomNumSupplier = ()  -> new Random().nextInt(100);
        System.out.println("Random number supplier: " + randomNumSupplier.get());
        System.out.println("Another random number supplier: " + randomNumSupplier.get());

        // Supplier to provide a default value
        Supplier<String> defaultSupplier = () -> "Default value";
        String value = null;
        String result = (value != null) ? value : defaultSupplier.get();
        System.out.println("Result: " + result);
    }
}
