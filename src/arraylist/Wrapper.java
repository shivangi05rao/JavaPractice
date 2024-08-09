package arraylist;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        //wrapper class
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//        Float f = Float.valueOf(4.6f);

        ArrayList<Integer> l1 = new ArrayList<>();

        //Add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(3));

        // print with for loop
        for (int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        //printing the array list directly
        System.out.println(l1);

        //adding element at some index
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        //removing element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(8));
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(7))); // will also print boolean answer
        System.out.println(l1);


        //checking if the element exists or not
        System.out.println(l1.contains(Integer.valueOf(6)));

        //If we don't specify class, we can put any type of data in the list
        ArrayList l2 = new ArrayList();
        l2.add("qwrty");
        l2.add(1);
        l2.add(true);
        System.out.println(l2);
    }
}
