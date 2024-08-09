package strings;

import java.util.Scanner;

public class PrintAllSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String s = sc.nextLine();
        String s = "abcd"; //0 to 3
        for (int i = 0; i <=s.length(); i++){
            for (int j = i+1; j <= s.length(); j++){
                System.out.print(s.substring(i,j)+ " ");
            }
        }
    }
}
