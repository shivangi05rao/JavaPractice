package leetcode.easy;

import java.util.Scanner;

public class PalindromeNumber {
    //Input: x = 121
    //Output: true
    //Explanation: 121 reads as 121 from left to right and from right to left.
    public static boolean isPalindrome(int x){
        //First Approach
        int num = x;
        int rev = 0;
        while (x > 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        if (num == rev){
            return true;
        }
        return false;

        //Second Approach
//        String str = String.valueOf(x);
//        int length = str.length();
//        for (int i = 0; i < length/2; i++){
//            if (str.charAt(i) != str.charAt(length-i -1){
//                return false;
//            }
//        }
//        return true;
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
