package examples;

import java.util.Scanner;

public class WhileLoopN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while (num <= n){
            //System.out.println(num);
            //to add sum of n natural numbers
            sum = sum+num;
            num++;
        }
        System.out.println(sum);

        //For loop
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }

        //Do While Loop
        int nums = 0;
        do {
            System.out.println(nums);
            nums++;
        }while (nums <= 10);
    }
}
