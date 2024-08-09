package collectionframework.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FetchingAndInserting {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("third");

        //Fetching Using iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Fetching Using for-each loop
        for (String element : hashSet) {
            System.out.println(element);
        }


        //Fetching Using a stream
        hashSet.stream()
                .forEach(System.out::println);


        //Converting to an Array
        Object[] array = hashSet.toArray();
        for (Object element : array) {
            System.out.print((String) element + " ");
        }
        System.out.println();

        //Fetching Using a For Loop with Iterator
        for (Iterator<String> iterator1 = hashSet.iterator(); iterator1.hasNext();) {
            String element = iterator1.next();
            System.out.println(element);
        }

    }
}
