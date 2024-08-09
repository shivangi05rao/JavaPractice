package oops;

public class MakeFractionClass {
   public static class Fraction{
        int numerator;
        int denominator;

       //constructor
       public Fraction(){
       }

       public Fraction(int numerator, int denominator){
           this.numerator = numerator;
           this.denominator = denominator;
       }

   }

//   public int simplify(int f1, int f2){
//
//   }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 7);
        System.out.println(f1.numerator + "/" + f1.denominator);
    }
}
