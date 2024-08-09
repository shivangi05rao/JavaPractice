package java_coding_problems_book.stringsquestion;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingVowelsAndConsonants {

    //Approach - 1
    public static void countVAndC(String str){
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if ((c != ' ') && (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u')){
                vowel++;
            } else {
                consonant++;
            }
        }

        System.out.println("No. of vowels: " + vowel);
        System.out.println("No. of consonants: " + consonant);
    }

    //Approach - 2 using Hash Set
    public static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

//    public static Pair<Integer, Integer> countVowAndConso(String str){
//        str = str.toLowerCase();
//        int vowel = 0;
//        int consonant = 0;
//
//        for (int i = 0; i < str.length(); i++){
//            char c = str.charAt(i);
//            if (allVowels.contains(c)){
//                vowel++;
//            } else if (c >= 'a' && c <= 'z'){
//                consonant++;
//            }
//        }
//        return Pair.of(vowel, consonant);
//    }

    public static void main(String[] args) {
        countVAndC("Shivangi");
    }
}
