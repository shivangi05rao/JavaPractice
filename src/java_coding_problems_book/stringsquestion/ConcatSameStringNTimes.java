package java_coding_problems_book.stringsquestion;

public class ConcatSameStringNTimes {

    public static String concatRepeat1(String input, int n){
        return input.repeat(n);
    }

    public static void main(String[] args) {

        String res1 = concatRepeat1("Hello ", 5);
        System.out.println(res1);
    }
}
