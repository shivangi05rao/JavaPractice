package recursionbacktraking;

import java.util.ArrayList;

public class SubsetOfNaturalNumbers {
    //print all subset of a SET of first n natural numbers
    public static void printSubset(ArrayList<Integer> subset){
        for (int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void subsetOfSet(int n, ArrayList<Integer> subset){
        if (n==0){
            printSubset(subset);
            return;
        }
        //Add
    subset.add(n);
    subsetOfSet(n-1, subset);
        //Not Added
    subset.remove(subset.size()-1);
    subsetOfSet(n-1, subset);
    }

    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        subsetOfSet(3, subset);
    }
}
