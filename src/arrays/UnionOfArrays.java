package arrays;

import java.util.HashSet;
import java.util.Set;

class UnionOfArrays {
    static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int[] array1 = {2, 5, 5, 8, 8, 8, 9, 30, 45};
        int[] array2 = {5, 8, 9, 10, 45, 50, 60};

        Set<Integer> set = new HashSet<>();

        // Adding all elements from array1 to the set
        for (int num : array1) {
            set.add(num);
        }

        // Adding all elements from array2 to the set
        for (int num : array2) {
            set.add(num);
        }

        // Converting set back to an array
        int[] unionArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            unionArray[index++] = num;
        }

        // Printing the union array
        printArray(unionArray);
    }
}
