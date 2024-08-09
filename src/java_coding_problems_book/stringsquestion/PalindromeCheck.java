package java_coding_problems_book.stringsquestion;

public class PalindromeCheck {

    public static boolean isPalindrome(String input) {
        input.toLowerCase();
        String rev = "";

        for (int i = input.length()-1; i >= 0; i--){
            rev = rev + input.charAt(i);
        }

        if (input.equals(rev)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean res = isPalindrome("mam");
        System.out.println(res);
    }
}
