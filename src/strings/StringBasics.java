package strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
//        char[] arr = new char[10];
//       // String str = "Shivangi";
//        //System.out.println(str);
        Scanner sc = new Scanner(System.in);
//        //String s = sc.next();
//        //System.out.println(s);
//        String sr = sc.nextLine();
//        System.out.println(sr);

//        String str = "Shivangi";
//
//        //String length
//        System.out.println(str.length());
//
//        //Char at string --> Gives the index of the character in the String
//        char ch = str.charAt(3);
//        System.out.println(ch);
//
//        //Index of String --> gives the index of a character of a String
//        String s = "Shivangi";
//        int index = s.indexOf('i');
//        System.out.println(index);

//        //Compare to Strings
//        String str = "Hello";
//        String gtr = "Kello";
//        System.out.println(str.compareTo(gtr));

        //Contains()
//        String str = "Shivangi Rao";
//        System.out.println(str.contains("via")); // false  "iva"--> true

        //Starts With
        String str = "Shivangi Rao";
        System.out.println(str.startsWith("Shi")); //true

        //ends with
        System.out.println(str.endsWith("ga")); //false

        //toLowerCase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        //Concat String
        String s1 = "I have a beautiful flower";
        String s2 = ", Lily";
        //String s3 = s1.concat(s2);
        //System.out.println(s3);
        System.out.println(s1.concat(s2));

        //substring(i,j)

    }
}
