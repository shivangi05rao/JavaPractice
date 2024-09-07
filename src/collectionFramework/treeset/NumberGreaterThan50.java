package collectionFramework.treeset;

import java.util.*;

public class NumberGreaterThan50 {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : numbers){
            treeSet.add(i);
        }
        System.out.println("Fetching all the elements less than 50 " + treeSet.headSet(50));
    }
}
