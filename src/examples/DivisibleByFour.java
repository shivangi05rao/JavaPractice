package examples;

import java.util.Scanner;

public class DivisibleByFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(n): ");
        long n = sc.nextLong();
        long lastTwoDigits = n % 100;

        if (lastTwoDigits % 4 == 0){
            System.out.println("The number(n) is divisible by 4");
        } else {
            System.out.println("The number(n) is not divisible by 4");
        }
    }
}
