package arrays;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number less than 20: ");
        int n = sc.nextInt();

        if (n <= 1 || n > 20){
            System.out.println("Invalid number, try again: ");
        } else {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;

            System.out.println("First n terms of fibonacci sequence are: ");
            int count = 2;
            while (count < n){
                fib[count] = fib[count-1] + fib[count-2];
                count++;
            }

            for (int i = 0; i < n; i++){
                System.out.print(fib[i] + " ");
            }
        }
    }
}
