package collectionframework.allinone;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // Creating a SortedSet (TreeSet)
        SortedSet<String> sortedSet = new TreeSet<>();

        // Adding elements to the SortedSet
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Orange");
        sortedSet.add("Grapes");
        sortedSet.add("Kiwi");

        // Displaying the SortedSet
        System.out.println("SortedSet: " + sortedSet);
        System.out.println();

        // Using SortedSet-specific methods
        System.out.println("Comparator: " + sortedSet.comparator());
        System.out.println();

        // SubSet: Elements from "Banana" (inclusive) to "Grapes" (exclusive)
        SortedSet<String> subSet = sortedSet.subSet("Banana", "Grapes");
        System.out.println("SubSet: " + subSet);
        System.out.println();

        // HeadSet: Elements less than "Grapes"
        SortedSet<String> headSet = sortedSet.headSet("Grapes");
        System.out.println("HeadSet: " + headSet);
        System.out.println();

        // TailSet: Elements greater than or equal to "Grapes"
        SortedSet<String> tailSet = sortedSet.tailSet("Grapes");
        System.out.println("TailSet: " + tailSet);
        System.out.println();

        // First and Last elements
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());
    }
}
