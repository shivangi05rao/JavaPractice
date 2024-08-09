package datastructure.linkedlist.educative;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //Inserting
        list.add(1);
        list.add(2);
        list.add(3);
        list.addLast(5);
        list.add(4);
        System.out.println(list);

        list.addFirst(6);
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(101);
        list1.add(102);
        list1.addFirst(103);
        System.out.println(list1);

        list.addAll(2, list1);
        System.out.println(list);

        //Fetching
        System.out.println(list.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list.get(5));

        //Removing
        list.remove(Integer.valueOf(3));
        System.out.println(list);

        list.removeFirstOccurrence(1);
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
