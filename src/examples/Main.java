package examples;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //the number n is divisible by 3 if the sum of the digits in number n is divisible by 3.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println(sum);
        if (sum%3 ==0){
            System.out.println(sum + " is divisible by 3");
        } else {
            System.out.println(sum + " is not divisible by 3");
        }

        //Primitive data types --> int, boolean, float, double, long, short, byte, char
        //Non primitive data types --> Strings, Interfaces, Arrays, Classes
        //Class is the blueprint with some attributes and methods
        //Object is the instance of the class
    }
}