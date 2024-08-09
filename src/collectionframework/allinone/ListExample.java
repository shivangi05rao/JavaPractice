package collectionframework.allinone;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    //Collection framework is a combination of classes and interfaces
//Iterable --> Collection -->(List, Queue, Set)
//Methods on Collection Framework --> add, size, remove, iterate, addAll, removeAll, clear
//List Interface --> List -> ArrayList, LinkedList, Vector-> Stack
//Queue Interface (FIFO) --> Queue --> Priority Queue, LinkedList, Dequeue(Double ended queue)-> ArrayDequeue
//Set Interface --> HashSet, LinkedHashSet, SortedSet-> TreeSet (Set is a group of objects in which each an every object are unique)
//Map Interface --> HashSet, LinkedHashSet, HashTable, SortedSet-> TreeSet
    public static void main(String[] args) {
        //Creating a list
        List<String> myList = new ArrayList<>();

        //Adding elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Banana"); //Duplicate element
        System.out.println()
        ;
        //Displaying the original List
        System.out.println("Original List: " + myList);
        System.out.println();

        //Using size() method
        System.out.println("Size of list: " + myList.size());
        System.out.println();

        //Using isEmpty() method
        System.out.println("Is the list empty? " + myList.isEmpty());
        System.out.println();

        // Using contains() method
        System.out.println("Does the list contain 'Banana'? " + myList.contains("Banana"));
        System.out.println();

        // Using indexOf() method
        System.out.println("Index of Banana: " + myList.indexOf("Banana"));
        System.out.println();

        // Using get() method
        System.out.println("Element at index 1: " + myList.get(1));
        System.out.println();

        // Using listIterator() method
        System.out.println("List in reverse order:");
        ListIterator<String> listIterator = myList.listIterator(myList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " ");
        }
        System.out.println();

        // Using subList() method
        List<String> subList = myList.subList(1,3);
        System.out.println("Sublist from index 1 to 3: " + subList);
        System.out.println();

        // Using add() method
        myList.add("Grapes");
        System.out.println("After adding 'Grapes': " + myList);
        System.out.println();

        // Using add(index, element) method
        myList.add(1, "Cherry");
        System.out.println("After adding 'Cherry' at index 1: " + myList);
        System.out.println();

        // Using addAll() method
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Mango");
        myList.addAll(moreFruits);
        System.out.println("After adding more fruits: " + myList);
        System.out.println();

        // Using remove() method
        myList.remove("Banana");
        System.out.println("After removing 'Banana': " + myList);
        System.out.println();

        // Using removeAll() method
        List<String> removeList = new ArrayList<>();
        removeList.add("Orange");
        removeList.add("Mango");
        myList.removeAll(removeList);
        System.out.println("After removing specified fruits: " + myList);
        System.out.println();

        // Using set() method
        myList.set(0,"Strawberry");
        System.out.println("After setting element at index 0 to 'Strawberry': " + myList);
        System.out.println();

        // Using toArray() method
        Object[] array = myList.toArray();
        System.out.println("Array representation to the List: ");
        for (int i = 0; i<array.length ; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();

        // Using clear() method
        myList.clear();
        System.out.println("After clearing the list: " + myList);
    }
}
