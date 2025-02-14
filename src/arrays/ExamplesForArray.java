package arrays;

import java.util.Scanner;

class exg{
    void sum(){
        int sum = 0;
        int [] arr = {9, 5, 3};
        for (int i = 0; i < 3; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    void findX(){
        int[] arr = {2, 7, 5, 8, 5};
        int x = 5;
        int ans = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(ans);
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //trying to copy array
}


public class ExamplesForArray{
    public static void main(String[] args) {
        exg obj = new exg();
        obj.sum();
        obj.findX();
        obj.input();
    }
}