package java_coding_problems_book.stringsquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicateCharacters {
    public static void dupChar(String input) {
        //Approach - 1
        //create HashMap
        Map<Character, Integer> countDuplicateMap = new HashMap<>();

        //Converts this String to a new character array
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (countDuplicateMap.containsKey(c)) {

                //get value by key and increment its value by 1
                countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
            } else {
                countDuplicateMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countDuplicateMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    //Approach - 2 Using Java 8
    public static void dupChar2(String input) {
        //convert string into stream
        Map<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });
    }

    //Approach - 3 Using loops
    public static void dupChar3(String input) {
        // Convert the string to lowercase to treat 'A' and 'a' as duplicates
        input = input.toLowerCase();

        // Create an array to store the count of each character
        int[] charCount = new int[256];     // Assuming ASCII characters

        // Iterate through the string and update the character count array
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCount[currentChar]++;
        }

        // Display the duplicate characters and their counts
        System.out.println("Duplicate characters in the string: ");

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " - Count: " + charCount[i]);
            }
        }

    }

    public static void main(String[] args) {
        //1
        dupChar("JavaJavaEEZ");
        //2
        dupChar2("JavaJavaEEZ");
        //3
        dupChar3("JavaJavaEEZ");
    }
}
