package strings;

import java.util.Scanner;

public class ReverseOnSamePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: "); //"Java Programming"
        String str = sc.nextLine();
        //[Java, Programming]
        String[] words = str.split(" ");
        String revStr = "";
        for (int i=0; i< words.length; i++){
            String word = words[i];
            String revWord = "";
            for (int j = word.length()-1; j>=0; j--){
                revWord = revWord + word.charAt(j); //avaJ
            }
            revStr = revStr + revWord +" "; //avaJ gnimmargorP
        }
        System.out.println(revStr);

    }
}
