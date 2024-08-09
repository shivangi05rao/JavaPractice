package arrays;

import java.util.Scanner;

public class FirstNPrimeNumbersInArray {

    static void printArray(int arr[], int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of prime numbers you want: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid input. Please enter positive number");
        } else {
            int[] primes = new int[n];
            int count = 0;
            int num = 2;

            while (count < n){
                if (isPrime(num)){
                    primes[count] = num;
                    count++;
                }
                num++;
            }
            System.out.print("The first " + n + " prime numbers are: ");
            printArray(primes, n);
        }

    }
}
