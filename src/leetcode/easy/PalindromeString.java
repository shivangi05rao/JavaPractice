package leetcode.easy;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: "); //bab
        String str = scanner.nextLine();

        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            rev.append(str.charAt(i));
        }
        System.out.println(str.contentEquals(rev));

    }
}
