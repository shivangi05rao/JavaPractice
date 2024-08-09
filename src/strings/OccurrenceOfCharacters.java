package strings;

import java.util.Scanner;

public class OccurrenceOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i<= words.length; i++){
            int count = 0;
            String word = words[i];
            for (int j = i+1; j <= word.length()-1; j++){
            }
        }
    }
}
