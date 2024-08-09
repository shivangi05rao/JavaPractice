package Patterns;

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
//        outer: for (int i=0; i<=n; i++){
//            inner: for (int j=0; j<=n; j++){
//                System.out.println(i + "," + j);
//            }
//        }
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= c; j++){
                if (i == 1 || i == r || j == 1 || j == c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
