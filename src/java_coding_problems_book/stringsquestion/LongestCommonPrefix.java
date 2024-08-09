package java_coding_problems_book.stringsquestion;

import java.util.Arrays;

public class LongestCommonPrefix {

    ///Approach - 1
    public static String longCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        //Sort the array
        Arrays.sort(strs);

        //Get the first and last string
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        //Start comparing{
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }

    //Approach - 2
    public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return ""; // No common prefix for an empty array
        }

        // Iterate through characters of the first string
        for (int i = 0; i < strings[0].length(); i++) {
            char currentChar = strings[0].charAt(i);

            // Compare with corresponding characters in other strings
            for (int j = 1; j < strings.length; j++) {
                if (i >= strings[j].length() || strings[j].charAt(i) != currentChar) {
                    // Found the end of the common prefix
                    return strings[0].substring(0, i);
                }
            }
        }

        // The entire first string is a common prefix
        return strings[0];
    }

    public static void main(String[] args) {
        String res = longCommonPrefix(new String[]{"club", "clap", "clove"});
        System.out.println("The longest common prefix is: " + res);

        String[] inputStrings = {"flower", "flow", "flight"};
        String commonPrefix = longestCommonPrefix(inputStrings);
        System.out.println("Longest common prefix: " + commonPrefix);
    }
}
