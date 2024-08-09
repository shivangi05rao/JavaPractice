package java_coding_problems_book.stringsquestion;

public class WhetherStringContainsOnlyDigits {

    //Approach - 1
    public static boolean containsOnlyDigits(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    //Approach - 2 Java 8
    public static boolean onlyDigits(String str){
        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    public static void main(String[] args) {
        //1
        boolean result = containsOnlyDigits("12345");
        if (result) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does not contains only digits");
        }

        //2
        boolean result2 = onlyDigits("S1234");
        if (result2) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does not contains only digits");
        }
    }
}
