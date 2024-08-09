package leetcode.leetcode75;

import java.util.Scanner;

public class CanPlaceFlowers {
    static boolean placeFlowers(int[] flowerbed, int n){
        if (n == 0){
            return true;
        }
        int l = flowerbed.length;
        int count = 0;
        for (int i = 0; i < l; i++){
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == l-1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                count++;

                if (count == n)
                    return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of beds: ");
        int num = sc.nextInt();

        System.out.println("Enter which flowerbed is planted: ");
        int[] flowerbed = new int[num];
        for (int i = 0; i < num; i++) {
            flowerbed[i] = sc.nextInt();
        }

        System.out.println("Enter the number of flowers: ");
        int n = sc.nextInt();

        boolean result = placeFlowers(flowerbed, n);

        System.out.println("Result: " + result);
    }
}
