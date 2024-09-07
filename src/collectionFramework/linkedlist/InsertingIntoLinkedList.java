package collectionFramework.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertingIntoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addLast(3);
        System.out.println(linkedList);

        linkedList.addFirst(10);
        System.out.println(linkedList);

        linkedList.add(2, 20);
        System.out.println(linkedList);

        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);

        linkedList.addAll(3,list);
        System.out.println(linkedList);



    }
}
