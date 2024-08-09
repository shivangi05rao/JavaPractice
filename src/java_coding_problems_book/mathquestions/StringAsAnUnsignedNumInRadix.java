package java_coding_problems_book.mathquestions;

public class StringAsAnUnsignedNumInRadix {
    public static void main(String[] args) {
        String nri = "255500";
        int result = Integer.parseUnsignedInt(nri, Character.MAX_RADIX);
        System.out.println(result);
    }
}
