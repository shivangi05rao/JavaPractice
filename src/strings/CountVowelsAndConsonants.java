package strings;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        int i, vowel = 0, consonant = 0;
        for (i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c!=' '){
                if (c == 'A'|| c == 'E'|| c == 'I'|| c == 'O'|| c == 'U'){
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("No. of vowel: " + vowel);
        System.out.println("No. of consonants: " + consonant);
    }
}
