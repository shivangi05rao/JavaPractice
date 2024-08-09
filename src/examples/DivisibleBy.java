package examples;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%5==0 || n%3==0){
            if (n%15 != 0){
                System.out.println("The number is divisible by 5 or 3 but not by 15");
            } else {
                System.out.println("Not divisible");
            }
         } else {
            System.out.println("Not Divisible");
        }
    }
}
