package collectionFramework.allInOne;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //Creating a HashSet(a class that implements Set Interface)
        Set<String> fruitSet = new HashSet<>();

        // Adding elements to the set
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");

        // Displaying the set
        System.out.println("Initial Set: " + fruitSet);
        System.out.println();

        // Adding more elements
        fruitSet.add("Grapes");
        fruitSet.add("Banana"); //Duplicate will not be added

        // Displaying the set after additions
        System.out.println("Set after additions: " + fruitSet);
        System.out.println();

        // Removing an element
        fruitSet.remove("Orange");

        // Displaying the set after removal
        System.out.println("Set after removal: " + fruitSet);
        System.out.println();

        // Checking if the set contains an element
        boolean containApple = fruitSet.contains("Apple");
        System.out.println("Does the set contain Apple? " + containApple);
        System.out.println();

        // Checking if the set is empty
        boolean isEmpty = fruitSet.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);
        System.out.println();

        // Getting the size of the set
        int setSize = fruitSet.size();
        System.out.println("Size of the set: " + setSize);
        System.out.println();

        // Creating another set for intersection demonstration
        Set<String> secondSet = new HashSet<>();
        secondSet.add("Banana");
        secondSet.add("Grapes");

        // Retaining only common elements between the sets
        fruitSet.retainAll(secondSet);

        // Displaying the set after retaining common elements
        System.out.println("The set after retaining common elements: " + fruitSet);
        System.out.println();

        // Clearing the set
        fruitSet.clear();

        // Displaying the set after clearing
        System.out.println("Displaying the set after clearing: " + fruitSet);
    }
}
