package strings;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        int count = 1;
        for (int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            char d = s.charAt(i+1);
            if (c == ' ' && d != ' '){
                count++;
            }
        }
        System.out.println("No. of words: "+ count);
    }
}
