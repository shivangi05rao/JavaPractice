package java_coding_problems_book.stringsquestion;

import java.util.HashSet;
import java.util.Set;

public class GeneratingAllPermutation {
    public static void permuteAndPrint(String str) {
        permuteAndPrint("", str);
    }
    //Approach - 1
    public static void permuteAndPrint(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }
    //Approach - 2
    public static Set<String> permuteAndStore(String str){
        return permuteAndStore("", str);
    }
    private static Set<String> permuteAndStore(String prefix, String str){
        Set<String> permutations = new HashSet<>();
        int n = str.length();

        if (n == 0){
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++){
                permutations.addAll(permuteAndStore(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i)));
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        //1
        permuteAndPrint("ABC");
        //2
        Set<String> res = permuteAndStore("AB", "CD");
        System.out.println(res);
    }
}
