package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    static void reversingList(ArrayList<Integer> list){
        for (int i = 0, j = list.size()-1; i < j; i++, j--){
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original array: " + list);
        //reversingList(list);
        Collections.reverse(list);
        System.out.println("Reversed array: " + list);
        Collections.sort(list);
        System.out.println("Ascending order: " + list);
        list.sort(Collections.reverseOrder());
        System.out.println("Descending order: " + list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("hi");
        l1.add("my");
        l1.add("is");
        l1.add("shivangi");
        Collections.sort(l1);
        l1.sort(Collections.reverseOrder());
        System.out.println(l1);

    }
}
