package java8.fucntionalInterface.supplier;

import java.util.function.DoubleSupplier;

public class DoubleSup {
    public static void main(String[] args) {
        DoubleSupplier supplier = () -> (int)(Math.random() * 10);
        System.out.println(supplier.getAsDouble());
    }
}
