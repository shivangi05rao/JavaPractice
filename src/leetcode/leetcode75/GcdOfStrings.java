package leetcode.leetcode75;

import java.util.Scanner;

public class GcdOfStrings {
    static String gcd(String str1, String str2){
       int n1 = str1.length();
       int n2 = str2.length();
       if (n2 > n1){
           return gcd(str2, str1);
       }
       if (str2.equals(str1)){
           return str1;
       }
       if (str1.startsWith(str2)){
           return gcd(str1.substring(n2), str2);
       }
       return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String str1 = scanner.next();

        System.out.print("Enter the second word: ");
        String str2 = scanner.next();

        String result = gcd(str1, str2);
        System.out.println("The gcd string is: " + result);
    }
}
