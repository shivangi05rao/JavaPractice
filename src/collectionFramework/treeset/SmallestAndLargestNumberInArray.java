package collectionFramework.treeset;

import java.util.TreeSet;

public class SmallestAndLargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : numbers){
            treeSet.add(i);
        }

        for (int i : treeSet){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
