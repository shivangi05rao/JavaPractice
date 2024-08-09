package java_coding_problems_book.mathquestions;

import java.util.function.BinaryOperator;

public class MinAndMaxOfTwoNumbers {
    public static void main(String[] args) {
        int i1 = -45;
        int i2 = -25;
        int min = Math.min(i1, i2);
        int max = Math.max(i1, i2);
        System.out.println(min);
        System.out.println(max);

        double d1 = 0.023844D;
        double d2 = 0.346752D;
        double min1 = Double.min(d1,d2);
        double max1 = Double.max(d1, d2);
        System.out.println(min1);
        System.out.println(max1);

        float f1 = 33.34f;
        final float f2 = 33.213f;
        float min2 = BinaryOperator.minBy(Float::compare).apply(f1,f2);
        float max2 = BinaryOperator.maxBy(Float::compare).apply(f1, f2);
        System.out.println(min2);
        System.out.println(max2);
    }
}
