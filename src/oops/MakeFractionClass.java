package oops;

public class MakeFractionClass {
    public static class Fraction {
        int numerator;
        int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 7);
        System.out.println(f1.numerator + "/" + f1.denominator);
    }
}
