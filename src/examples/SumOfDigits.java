package examples;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0){
            count += n%10;
            n = n/10;
        }

        System.out.println(count);
        //Using for loop
        for (int i=0; i<=n; i++){
            if (i>0){
                count = count + (n%10);
            }
            System.out.println(count);
        }
    }
}
