package leetcode.leetcode75;

import java.util.Scanner;

public class MergeStringAlternately {
    static String merge(String word1, String word2) {
       int i = 0, j = 0;

       int w1 = word1.length();
       int w2 = word2.length();

       StringBuilder sb = new StringBuilder();

       while (i < w1 && j < w2) {
           sb.append(word1.charAt(i++));
           sb.append(word2.charAt(j++));
       }

       while (i <  w1) {
           sb.append(word1.charAt(i++));
       }

       while (j  < w2) {
           sb.append(word2.charAt(j++));
       }

       return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        String result = merge(word1, word2);
        System.out.println("The merged string is: " + result);
    }
}
