package java_coding_problems_book.mathquestions;

public class ApplyingLogicalToBoolean {
    public static void main(String[] args) {
        int s = 10;
        int m = 21;

        if (Boolean.logicalAnd(s > m, m < 50)) {
            System.out.println("Logical AND condition is true");
        } else {
            System.out.println("Logical AND condition is false");

        }

        if (Boolean.logicalOr(s > m, m < 50)) {
            System.out.println("Logical OR condition is true");
        } else {
            System.out.println("Logical OR condition is false");
        }

        if (Boolean.logicalXor(s > m, m < 50)) {
            System.out.println("Logical XOR condition is true");
        } else {
            System.out.println("Logical XOR condition is false");
        }
    }
}
