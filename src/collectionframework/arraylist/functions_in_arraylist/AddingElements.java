package collectionframework.arraylist.functions_in_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddingElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //fetching element with index
        System.out.println("The element at index two is: " + list.get(1));
        System.out.println("The size of the List is: " + list.size());

        list.add(4);
        System.out.println(list);

        list.add(1, 150);
        System.out.println(list);

        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);

        ArrayList<Integer> copy = (ArrayList<Integer>) ((ArrayList<?>) list).clone();
        copy.add(98765432);
        System.out.println(copy);

        ArrayList<Integer> cop = new  ArrayList<> (copy);
        cop.add(1234567890);
        System.out.println(cop);
//        newList.addAll(list);
//        System.out.println(newList);

        List<Integer> list1 = cop.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list1);

        Collections.sort(cop, Comparator.reverseOrder());
        System.out.println(cop);

        List<Integer> list2 = cop.stream()
                //.sorted((a,b) -> b - a)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(list2);

    }
}
