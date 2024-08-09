package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    //First Approach
    public static int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; i++){
//            for (int j = i+1; j < nums.length; j++){
//                if (nums[i] + nums[j] == target){
//                    res[0] = i;
//                    res[1] = j;
//                    return res;
//                }
//            }
//        }
//        return res;

        //Second Approach
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            int diff = target - curr;

            if (map.containsKey(diff)) {
                res[0] = i;
                res[1] = map.get(diff);
                return res;
            } else {
                map.put(curr, i);
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = sc.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the array separated by spaces: ");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();
        System.out.println(target);

        int[] res = twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to the target: " + res[0] + ", " + res[1]);
    }
}
