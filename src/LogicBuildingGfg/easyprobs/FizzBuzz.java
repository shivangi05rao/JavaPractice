package LogicBuildingGfg.easyprobs;

import stringbuilder.StringBui;

import java.util.ArrayList;
import java.util.HashMap;

public class FizzBuzz {
    //Naive
    static ArrayList<String> fizzBuzzFizz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    } //Time Complexity: O(n), since we need to traverse the numbers from 1 to n in any condition.
    //Auxiliary Space: O(n), for storing the result

    //[Better Approach] By String Concatenation
    static ArrayList<String> stringFizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = "";

            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz";

            if (s.isEmpty()) s += i;
            list.add(s);
        }
        return list;
    } //Time Complexity: O(n), since we need to traverse the numbers from 1 to n in any condition.
    //Auxiliary Space: O(n), for storing the result

    //Using hashmap
    static ArrayList<String> hashMapFizzBUzz(int n) {
        ArrayList<String> list = new ArrayList<>();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");

        int[] divisors = {3, 5};

        for (int i = 1; i <= n; i++) {
            StringBuilder s = new StringBuilder();

            for (int d : divisors) {
                if (i % d == 0) {
                    s.append(map.get(d));
                }
            }

            if (s.isEmpty()) {
                s.append(i);
            }

            list.add(s.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzzFizz(15));
        System.out.println(stringFizzBuzz(3));
        System.out.println(hashMapFizzBUzz(15));
    }
}
