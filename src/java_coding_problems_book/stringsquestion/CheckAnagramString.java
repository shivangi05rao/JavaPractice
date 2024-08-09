package java_coding_problems_book.stringsquestion;

import java.util.Arrays;

public class CheckAnagramString {

    public static boolean isAnagramOrNot(String input1, String input2){
        String str1 = input1.replaceAll("//s", "");
        String str2 = input2.replaceAll("//s", "");

        if (str1.length() != str2.length()){
            return false;
        } else {
            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
    }

    public static void main(String[] args) {
       boolean res = isAnagramOrNot("Listen", "Silent");
        System.out.println(res);
    }
}
