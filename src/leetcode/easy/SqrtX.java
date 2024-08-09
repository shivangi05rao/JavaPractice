package leetcode.easy;

import java.util.Scanner;

public class SqrtX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        float n = (int)(Math.sqrt(x));
        int y = (int) Math.abs(n);
        System.out.println(y);
    }
}
