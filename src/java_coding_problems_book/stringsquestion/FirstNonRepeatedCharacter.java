package java_coding_problems_book.stringsquestion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        //Approach-1
        //given input string
        String input = "AABCDBE";

        for (int i = 0; i < input.length(); i++){
            boolean unique = true;
            for (int j = 0; j < input.length(); j++){
                if (i!=j && input.charAt(i) == input.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if (unique){
                System.out.println(input.charAt(i));
                break;
            }
        }

        //Approach -2 Using Collection Hash Map
        Map<Character, Integer> nonRepeatedCh = new HashMap<>();
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if (nonRepeatedCh.containsKey(c)){
                nonRepeatedCh.put(c, nonRepeatedCh.get(c)+1);
            } else {
                nonRepeatedCh.put(c, 1);
            }
        }
        System.out.println(nonRepeatedCh);

        for (Map.Entry<Character, Integer> entrySet : nonRepeatedCh.entrySet()){
            if (entrySet.getValue() == 1){
                System.out.println(entrySet.getKey());
                break;
            }
        }

        firstNonRepeatedCharacter("AABCDBE");
    }

    //Approach 3 Using Java 8
    public static void firstNonRepeatedCharacter(String input){
        Map<Character, Integer> chars = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            chars.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry: chars.entrySet()){
            if (entry.getValue() == 1){
                return;
            }
        }
    }
}
