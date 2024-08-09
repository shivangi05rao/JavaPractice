package strings;

import java.util.Scanner;

public class ConvertLowerToUpperToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        for (int i=0; i<s.length(); i++) {
            boolean flag = true;
            int ascii = s.charAt(i);
            if (ascii==' ') continue;
            if (ascii >= 97) flag = false;
            if (flag) {
                ascii = ascii + 32;
                char dh = (char) ascii;
                s.setCharAt(i, dh);
            } else {
                ascii = ascii - 32;
                char dh = (char) ascii;
                s.setCharAt(i, dh);
            }
        }
        System.out.println(s);
    }
}
