package leetcode.interview150questions;

import java.util.Arrays;

public class RemoveElement {
    /*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
    The remaining elements of nums are not important as well as the size of nums.
    Return k.*/

    public static int removeElement(int[] num, int val) {
        int count = 0;
        if (num == null || num.length == 0) {
            return 0;
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[count] = num[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = removeElement(nums1, val1);
        System.out.println("Example 1 Output: k = " + k1 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1)));

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = removeElement(nums2, val2);
        System.out.println("Example 2 Output: k = " + k2 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2)));

        // Example 3
        int[] nums3 = {0};
        int val3 = 1;
        int k3 = removeElement(nums3, val3);
        System.out.println("Example 3 Output: k = " + k3 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums3, 0, k3)));
    }
}
