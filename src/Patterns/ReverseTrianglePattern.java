package Patterns;

import java.util.Scanner;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
//        for (int i = 0; i <= r; i++){
//            for (int j = 0; j <= (r+1-i); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

                //OR

        for (int i = r; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
