package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen.
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());

        System.out.println(list);

        //Find the maximum & minimum number in an array of integers.
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(8);
        list1.add(24);
        list1.add(1);
        System.out.println(list1);

        int min = Collections.min(list1);
        System.out.println(min);
        int max = Collections.max(list1);
        System.out.println(max);


    }
}
