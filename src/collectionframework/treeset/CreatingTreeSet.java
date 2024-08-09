package collectionframework.treeset;

import java.util.*;

public class CreatingTreeSet {
    public static void main(String[] args) {
        //Using no args constructor
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3);

        for (int i : treeSet){
            System.out.print(i + " ");
        }

        System.out.println();

        //Using a constructor with a Collection type argument
        Collection<String> collection = Arrays.asList("Element1" , "Element2", "Element3");
        TreeSet<String> treeSet1 = new TreeSet<>(collection);
        for (String element : treeSet1) {
            System.out.print(element + " ");
        }

        System.out.println();
        //Using a constructor with the argument of type SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Element3");
        sortedSet.add("Element1");
        sortedSet.add("Element2");

        Set<String> treeSet2 = new TreeSet<>(sortedSet);

        for (String element : treeSet2) {
            System.out.print(element + " ");
        }

        System.out.println();
        //Fetching
        String s = treeSet1.first();
        System.out.print(s);

        System.out.println();
        //removing
        treeSet.remove(3);
        for (int i : treeSet){
            System.out.print(i + " ");
        }
    }
}
