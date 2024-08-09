package collectionframework.allinone;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        // Creating a NavigableSet using TreeSet
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        // Adding elements to the set
        navigableSet.add(3);
        navigableSet.add(7);
        navigableSet.add(1);
        navigableSet.add(5);
        navigableSet.add(9);

        System.out.println("NavigableSet: " + navigableSet);
        System.out.println();

        // Using various NavigableSet methods
        System.out.println("Lower to 6: " + navigableSet.lower(6));        // Output: 5
        System.out.println("Floor to 6: " + navigableSet.floor(6));        // Output: 5
        System.out.println("Ceiling to 6: " + navigableSet.ceiling(6));    // Output: 7
        System.out.println("Higher to 6: " + navigableSet.higher(6));      // Output: 7
        System.out.println();

        System.out.println("Poll first: " + navigableSet.pollFirst());     // Output: 1
        System.out.println("After polling first: " + navigableSet);
        System.out.println();

        System.out.println("Poll last: " + navigableSet.pollLast());       // Output: 9
        System.out.println("After polling last: " + navigableSet);
        System.out.println();

        // Creating a descending NavigableSet
        NavigableSet<Integer> descendingSet = navigableSet.descendingSet();
        System.out.println("Descending NavigableSet: " + descendingSet);
        System.out.println();

        // SubSet from 3 (inclusive) to 7 (exclusive)
        NavigableSet<Integer> subSet = navigableSet.subSet(3, true, 7, false);
        System.out.println("SubSet: " + subSet);
    }
}

