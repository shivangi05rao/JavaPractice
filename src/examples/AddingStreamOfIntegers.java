package examples;

import java.util.Scanner;

public class AddingStreamOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        //Random numbers or stream or integers to be added Using while loop

        while (n != -1){
            sum = sum+n;
            n = sc.nextInt();
        }
        System.out.println(sum);

        //Using do while loop
        do {
            sum = sum+n;
            n = sc.nextInt();
        }while (n != 0);
        System.out.println(sum);

    }
}
