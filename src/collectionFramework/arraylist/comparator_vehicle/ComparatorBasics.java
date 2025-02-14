package collectionFramework.arraylist.comparator_vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//class IntegerComparator implements Comparator<Integer> {
////    @Override
////    public int compare(Integer o1, Integer o2) {
////        return o1 - o2;
////    } //for increasing order
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//    } //for decreasing order
//}
//
//class StringComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o2.length() - o1.length();
//    }
//}

public class ComparatorBasics {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

       // list.sort(new IntegerComparator());
        //Using lambda increasing order
        list.sort((a, b) -> a - b);
        //Using lambda decreasing order
        list.sort((a, b) -> b - a);
        System.out.println(list);

        List<String> stringList = Arrays.asList("Banana", "Apple", "Mango", "Date");

       // stringList.sort(new StringComparator());
        //Using lambda increasing order
        stringList.sort((a, b) -> a.length() - b.length());
        //Using lambda decreasing order
        stringList.sort((a, b) -> b.length() - a.length());
        System.out.println(stringList);
    }
}
