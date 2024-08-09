package java_coding_problems_book.mathquestions;

public class SummingTwoLargeIntValuesAndOperationOverflow {
    public static void main(String[] args) {
        int x = 2;
        int y = 7;
        int z = x + y;
        System.out.println(z);

        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int z1 = x1 + y1;
       // int z1 = Math.addExact(x1,y1); //throws .ArithmeticException
        System.out.println(z1);

        long x2 = Integer.MAX_VALUE;
        long y2 = Integer.MAX_VALUE;
        long z2 = x2 + y2;
        System.out.println(z2);

        long x3 = Long.MAX_VALUE;
        long y3 = Long.MAX_VALUE;
        //long z3 = x3 + y3;
        long z3 = Long.sum(x3,y3);
        System.out.println(z3);

    }
}
