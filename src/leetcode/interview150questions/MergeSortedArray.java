package leetcode.interview150questions;

public class MergeSortedArray {
    /*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     representing the number of elements in nums1 and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements
    denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. Nums2 has a length of n*/
    public static void merge(int nums1[], int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p2 >= 0 ){
            if (p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        merge(nums1_1, m1, nums2_1, n1);
        System.out.println("Example 1 Output: " + java.util.Arrays.toString(nums1_1));

        // Example 2
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        merge(nums1_2, m2, nums2_2, n2);
        System.out.println("Example 2 Output: " + java.util.Arrays.toString(nums1_2));

        // Example 3
        int[] nums1_3 = {0};
        int m3 = 0;
        int[] nums2_3 = {1};
        int n3 = 1;
        merge(nums1_3, m3, nums2_3, n3);
        System.out.println("Example 3 Output: " + java.util.Arrays.toString(nums1_3));
    }
}
