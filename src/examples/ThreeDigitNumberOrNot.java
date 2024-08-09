package examples;

import java.util.Scanner;

public class ThreeDigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 99 && n < 1000){
            System.out.println("Yes, it is a three digit number");
        } else {
            System.out.println("No, it is not a three digit number");
        }
    }
}
