package Patterns;

import java.util.Scanner;

public class EvenOddNumPattern {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        for (int i = 1; i <= r; i++){
//            for (int j = 1; j <= c; j++){
//                if ((i + j) % 2 == 0){
//                    System.out.print(1);
//                } else {
//                    System.out.print(2);
//                }
//            }
//            System.out.println();
//        }
        print(3, 4);
    }

    public static void print(int r, int c) {
        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= c; j++){
                if ((i + j) % 2 == 0){
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
    //121212
    //212121
    //121212
    //212121
    //121212
    //212121
    //121212
}
