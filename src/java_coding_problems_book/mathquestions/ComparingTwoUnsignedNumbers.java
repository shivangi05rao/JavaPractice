package java_coding_problems_book.mathquestions;

public class ComparingTwoUnsignedNumbers {
    public static void main(String[] args) {
        //result = -1 indicating that Min val is smaller than max val;
        int resSigned = Integer.compare(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(resSigned);

        //result = 1 indicating that Max val is greater than max val;
        int resSigned1 = Integer.compareUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(resSigned1);
    }
}
