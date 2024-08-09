package java_coding_problems_book.stringsquestion;

public class CheckStringContainsSubstring {

    public static boolean isSubstring(String input1, String input2){
        return input1.matches("(.*)" + input2 + "(.*)");
    }

    public static boolean isSubstring1(String input1, String input2){
        return input1.contains(input2);
    }

    public static boolean isSubstring2(String input1, String input2){
        return input1.indexOf(input2) != 1;
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("substring", "sub"));
        System.out.println(isSubstring1("substring", "ab"));
        System.out.println(isSubstring2("substring", "ub"));

    }
}
