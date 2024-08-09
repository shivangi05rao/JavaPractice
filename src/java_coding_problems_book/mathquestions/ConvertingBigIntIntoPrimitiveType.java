package java_coding_problems_book.mathquestions;

import java.math.BigInteger;

public class ConvertingBigIntIntoPrimitiveType {
    public static void main(String[] args) {
        BigInteger nr = BigInteger.valueOf(Long.MAX_VALUE);

        long nrLong = nr.longValue();
        System.out.println(nrLong);

        int nrInt = nr.intValue();
        System.out.println(nrInt);

        long nrExactLong = nr.longValueExact();
        System.out.println(nrExactLong);

      //  int nrExactInt = nr.intValueExact();
       // System.out.println(nrExactInt); // throws arithmetic exception
    }
}
