package java_coding_problems_book.mathquestions;

public class ConvertingNumByUnsignedConversion {
    public static void main(String[] args) {
        long res = Integer.toUnsignedLong(Integer.MIN_VALUE);
        System.out.println(res);

        int res1 = Short.toUnsignedInt(Short.MIN_VALUE);
        int res2 = Short.toUnsignedInt(Short.MAX_VALUE);
        System.out.println(res1);
        System.out.println(res2);
    }
}
