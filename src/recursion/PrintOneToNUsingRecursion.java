package recursion;

import java.util.Scanner;

public class PrintOneToNUsingRecursion {

    // a function that calling itself with different parameters and base case to terminate the infinite loop.
    //in recursion, we solve a big problem by solving smaller sub problems

    //What to do to solve a recursion problem
    //1. Identifying the smaller problem
    //2. Self work
    //3. Identify the Base case -->The  smallest problem for which the answer is obvious

    //Syntax:
    //methodName(N parameters){
    //{
    //if(base case){
    //return result;
    //      }
    //return methodName(N parameters)
    //Self Work
    //}

    static void printDecreasing(int n){
        //base case
        if (n == 1){
            System.out.println(1);
            return;
        }

        //self work
        System.out.println(n);
        printDecreasing(n-1);
    }

    static void printIncreasing(int n){
        if (n == 1){                //Halting condition or base case
            System.out.println(n);
            return;
        }

        printIncreasing(n-1);       //Sub/smaller problem
        System.out.println(n);          //Self Work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        printDecreasing(n);
    }
}
