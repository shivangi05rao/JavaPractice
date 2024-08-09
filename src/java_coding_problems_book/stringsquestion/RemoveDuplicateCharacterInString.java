package java_coding_problems_book.stringsquestion;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class RemoveDuplicateCharacterInString {

    //Approach - 1 Using a character array
    public static void removeDup1(String input){
        char[] arr = input.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            boolean repeated = false;
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                        repeated = true;
                        break;
                }
            }
            if (!repeated){
                sb1.append(arr[i]);
            }
        }
        System.out.println(sb1);
    }

    //Approach - 2 Using Set Interface

    public static void removeDup2(String input){
        StringBuilder sb2 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++){
            set.add(input.charAt(i));
        }
        for (Character c : set){
            sb2.append(c);
        }
        System.out.println(sb2);
    }


    //Approach - 3 Using IndexOf(..) provided by string class
    public static void removeDup3(String input){
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int idx = input.indexOf(c, i+1);
            if (idx == -1){
                sb3.append(c);
            }
        }
        System.out.println(sb3);
    }

    //Approach - 4 Using Java 8
    public static void removeDup4(String input){
        StringBuilder sb4 = new StringBuilder();
        input.chars()
                .distinct()
                .forEach(c -> sb4.append((char) c));
        System.out.println(sb4);
    }

    public static void main(String[] args) {
        removeDup1("Programming");

        removeDup2("Programming");

        removeDup3("Programming");

        removeDup4("Programming");

    }
}
