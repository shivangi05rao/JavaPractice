package LogicBuildingGfg.easyprobs;

public class Palindrome {
    static int isPalindrome(int n) {
        int reverse = 0;
        int temp = n; //Math.abs(n);
        while (temp != 0) {
            reverse = (reverse * 10) + temp % 10;
            temp = temp / 10;
        }
        return reverse; //== Math.abs(n);
    } //Time Complexity : O(log10(n)) = O(number of digits), Auxiliary space : O(1)

    //[Alternate Approach] – Using Number as String
    //When the input number exceeds 1018, then finding the reverse can cause overflow in languages like: C, C++, Java, etc.
    // So, we can take the input number as a string and run a loop from starting to length/2 and compare the first
    // character (numeric) with the last character of the string, second character to second last one, and so on.
    // If any character mismatches, the string wouldn’t be a palindrome.

    static boolean isPalindrome2(int n) {
        String s = Integer.toString(Math.abs(n));
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i) != s.charAt(len-i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321));
        System.out.println(isPalindrome2(-12321));
    }
}
