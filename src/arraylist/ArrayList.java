package arraylist;
import java.util.ArrayList;
import java.util.Collections;

//Size of arrayList is variable(Can be changed), Memory mgt is non-continuous, Only objects can be stored in arraylist
//its memory is created in the heap memory
//Operation in collection frame works --> Add, Get, Update, Delete, Iteration
//Time Complexity --> Insert --> O(n), Search --> O(1)
class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int ele = list.get(0);
        System.out.println(ele);

        //to add element in between
        list.add(1,1);
        System.out.println(list);

        //set element(Update element)
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size of arraylist
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
