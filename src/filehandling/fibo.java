package filehandling;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
        //       if (n == 0) {
        //            System.out.println("0");
        //        } else if (n == 1) {
        //            System.out.println("1");
        //        } else {
        //            int a = 0, b = 1;
        //            for (int i = 2; i <= n; i++) {
        //                int next = a + b;
        //                a = b;
        //                b = next;
        //            }
        //            System.out.println("Fibonacci number at position " + n + " is: " + b);
        //        }

    }
}
