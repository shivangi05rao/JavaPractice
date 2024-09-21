package java8.fucntionalInterface.supplier;

import java.util.function.IntSupplier;

public class IntSup {
    public static void main(String[] args) {
        IntSupplier supplier = () -> (int)(Math.random() * 10);
        System.out.println(supplier.getAsInt());
    }
}
