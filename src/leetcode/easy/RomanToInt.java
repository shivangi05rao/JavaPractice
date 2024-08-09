package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
    public static int romanToInt(String s){
        //First approach
//        int ans = 0;
//        int num = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int c = s.charAt(i);
//            if(c == 'I'){
//                num = 1;
//            }
//            if(c == 'V'){
//                num = 5;
//            }
//            if(c == 'X'){
//                num = 10;
//            }
//            if (c == 'L') {
//                num = 50;
//            }
//            if (c == 'C') {
//                num = 100;
//            }
//            if (c == 'D') {
//                num = 500;
//            }
//            if (c == 'M') {
//                num = 1000;
//            }
//
//            if(num * 4 < ans){
//                ans = ans - num;
//            } else {
//                ans = ans + num;
//            }
//        }
//        return ans;

        //Second approach
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--){
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                result = result - map.get(s.charAt(i));
            } else{
                result = result + map.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman number: ");
        String s = sc.next();

        int number = romanToInt(s);
        System.out.println(number);
    }
}
