package collectionFramework.hashset;

import java.util.*;

public class RemovingFromHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Six");
        set.add("Seven");
        set.add("Eight");
        set.add("Nine");
        System.out.println(set);

        //Using remove keyword
        set.remove("Two");
        System.out.println("HashSet after removing one element: " + set);

        //Using removeIf() method
        set.removeIf(element -> element.contains("o"));
        System.out.println("HashSet after removing element that contains letter o in it: " + set);

        //Using iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.contains("e")) {
                iterator.remove();
            }
        }
        System.out.println("HashSet after removing element that contains letter e in it: " + set);

        //Using removeAll()
        List<String> elementsToRemove = Arrays.asList("Seven", "Eight", "Nine");
        set.removeAll(elementsToRemove);
        System.out.println("HshSet after removing seven, eight, nine from the set: " + set);

        //Using clear()
        set.clear();
        System.out.println("HashSet after removing all elements: " + set);

        //Checking if hashSet is empty
        System.out.println(set.isEmpty());


    }
}
