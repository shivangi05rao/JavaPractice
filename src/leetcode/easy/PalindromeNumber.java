package leetcode.easy;

import java.util.Scanner;

public class PalindromeNumber {
    //Input: x = 121
    //Output: true
    //Explanation: 121 reads as 121 from left to right and from right to left.
    public static boolean isPalindrome(int x){
        //First Approach
//        int originalNum = x;
//        int rev = 0;
//        if (x < 0){
//            return false;
//        }
//        while (x != 0){
//            rev = rev * 10 + x%10;
//            x = x/10;
//        }
//        if (originalNum == rev){
//            return true;
//        }
//        return false;

        //Second Approach
        String str = String.valueOf(x);
        int length = str.length();
        for (int i = 0; i < length/2; i++){
            if (str.charAt(i) != str.charAt(i)-length-i){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        System.out.println(x);

        boolean isPalindrome = isPalindrome(x);
        System.out.println(isPalindrome);
    }
}
