package recursion;

import java.util.HashSet;

public class UniqueSubsequencesOfString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences("aaa", 0, " ", set);
    }
    public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set){
        if (idx == str.length()){
            if (set.contains(newString)){
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        uniqueSubsequences(str, idx+1, newString+currChar, set);
        uniqueSubsequences(str, idx+1, newString, set);
    }
}
