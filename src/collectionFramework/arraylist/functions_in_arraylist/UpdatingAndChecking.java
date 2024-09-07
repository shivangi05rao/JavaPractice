package collectionFramework.arraylist.functions_in_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingAndChecking {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        list.set(1,100);
        System.out.println(list);

        if (list.contains(30)){
            System.out.println("List contains 30");
        }
        System.out.println("Index of first occurrence of 10 is: " + list.indexOf(10));
        System.out.println("Index of last occurrence of 10 is: " + list.lastIndexOf(10));
    }
}
