package leetcode.leetcode75;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithExtraCandies {
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int n = candies.length;
        int max = candies[0];
        for (int i = 1; i < n; i++){
            if (candies[i] > max){
                max = candies[i];
            }
        }

        List<Boolean> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(candies[i]+extraCandies >= max);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kids: ");
        int n = sc.nextInt();

        System.out.println("Enter number of candies each kid has: ");
        int candies[] = new int[n];
        for (int i = 0; i < n; i++){
            candies[i] = sc.nextInt();
        }

        System.out.println("Enter the number of extra candies: ");
        int extraCandies = sc.nextInt();

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println("Result: ");
        for (int i = 0; i < n; i++){
            System.out.print(result.get(i) + " ");
        }

    }
}
