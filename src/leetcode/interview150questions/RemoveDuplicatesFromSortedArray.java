package leetcode.interview150questions;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length-1 && nums[i] == nums[i+1]){
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("Example 1 Output: k = " + k1 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1)));

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("Example 2 Output: k = " + k2 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2)));
    }
}
