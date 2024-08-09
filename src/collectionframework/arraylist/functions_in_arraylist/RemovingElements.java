package collectionframework.arraylist.functions_in_arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemovingElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(30));
        System.out.println(list);

        list.clear();
        System.out.println(list);

        List<String> listStr = new ArrayList<>();
        listStr.add("apple");
        listStr.add("banana");
        listStr.replaceAll((element) -> element.toUpperCase());
        System.out.println(listStr);
    }
}
