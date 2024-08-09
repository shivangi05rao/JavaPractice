package java_coding_problems_book.stringsquestion;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayOfStringByLength {

    public static void sortArrayString1(String[] inputs){
        //Sort the array by length using a custom comparator
        Arrays.sort(inputs, Comparator.comparingInt(String::length));

        //print the sorted array using a for loop
        System.out.println("Sorted array by length: ");
        for (int i=0; i<inputs.length; i++){
            System.out.println(inputs[i]);
        }
    }

    public static void sortArrayString2(String[] inputs){
        for (int i = 0; i < inputs.length; i++){
            for (int j = i+1; j < inputs.length-1; j++){
                if (inputs[j].length() > inputs[j + 1].length()) {
                    // Swap elements if they are in the wrong order
                    String temp = inputs[j];
                    inputs[j] = inputs[j + 1];
                    inputs[j + 1] = temp;
                }
            }
        }

        //print the sorted array using a for loop
        System.out.println("Sorted array by length: ");
        for (int j=0; j<inputs.length; j++){
            System.out.println(inputs[j]);
        }
    }

    public static void main(String[] args) {
        sortArrayString1(new String[]{"apple", "banana", "kiwi", "orange", "grape"});
        sortArrayString2(new String[]{"apple", "banana", "kiwi", "orange", "grape"});
    }
}
