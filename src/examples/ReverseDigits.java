package examples;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0){
           count = count * 10 +(n%10);
           n = n/10;
        }
        System.out.println(count);
    }
}
