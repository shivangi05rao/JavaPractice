package java8.lambda;

import java.util.function.Function;

public class CapturingLambda {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplier = getMultiplier();
        System.out.println(multiplier.apply(10));
    }

    public static Function<Integer, Integer> getMultiplier() {
        int i = 5;
        int finalI = i;
        Function<Integer, Integer> multiplier = t -> t * finalI;
        i = 7;
        return multiplier;
    }
}
