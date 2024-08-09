package collectionframework.arraylist.iterations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        //Iterating using -> for loop
        System.out.println("Iterating using -> for loop");
        for (int i = 0; i < list.size(); i++) { //Simple for loop
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("Iterating using -> enhanced for loop");
        for (Integer i : list) {   //Enhanced for loop
            System.out.print(i + " ");
        }
        System.out.println();

        //Iterating using Iterator
        System.out.println("Iterating using -> Iterator, hasNext(), next()");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //Iterating using forEachRemaining() method
        System.out.println("Iterating using -> forEachRemaining() method");
        Iterator<Integer> newItr = list.iterator();
        newItr.forEachRemaining(element -> System.out.print(element + " "));
        System.out.println();

        //deleting an element from the list
        Iterator<Integer> itr1 = list.iterator();

        while(itr1.hasNext()) {
            int next = itr1.next();
            if(next == 30) {
                itr1.remove();
            }
        }
        System.out.println(list);
    }
}
