package java8.functionalInterface.predicate;

import java.util.function.Predicate;

public class negatePredicate {
    static boolean numIsLessThanTen(Predicate<Integer> predicate){
        return predicate.negate().test(14);
    }

    public static void main(String[] args) {
        Predicate<Integer> numberGreaterThan10 = p -> p > 10;

        boolean lessOrNot = numIsLessThanTen(numberGreaterThan10);

        System.out.println("Is the number less than 10: " + lessOrNot);
    }
}
