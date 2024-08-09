package examples;

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        if (l == b){
            System.out.println("Square");
        } else {
            System.out.println("Not Square");
        }
    }
}
