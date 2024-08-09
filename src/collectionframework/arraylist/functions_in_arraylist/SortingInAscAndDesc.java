package collectionframework.arraylist.functions_in_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInAscAndDesc {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        //Ascending
        Collections.sort(list);
        System.out.println("ArrayList in ascending order: " + list);

        //ArrayList in ascending order using stream
        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println("ArrayList in ascending order: " + sortedList);

        //Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("ArrayList in descending order: " + list);

        //ArrayList in descending order using stream
        List<Integer> sortedList1 = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("ArrayList in descending order: " + sortedList1);
    }
}
