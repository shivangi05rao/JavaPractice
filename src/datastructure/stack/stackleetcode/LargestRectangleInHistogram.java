package datastructure.stack.stackleetcode;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        // Input: heights = [2,1,5,6,2,3]
        // Output: 10
        int[] heights = {2, 1, 5, 6, 2, 3};
        int res = largestRectangleArea(heights);
        System.out.println(res);
    }

    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] nextSmIdx = new int[n];
        int[] prevSmIdx = new int[n];

        // Initialize nextSmIdx and prevSmIdx with default values
        for (int i = 0; i < n; i++) {
            nextSmIdx[i] = n;  // Default: beyond the last index
            prevSmIdx[i] = -1; // Default: before the first index
        }

        // Calculate nextSmIdx
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                nextSmIdx[st.pop()] = i;
            }
            st.push(i);
        }

        // Clear stack for the next use
        st.clear();

        // Calculate prevSmIdx
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                prevSmIdx[st.pop()] = i;
            }
            st.push(i);
        }

        // Calculate the maximum area
        int max = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nextSmIdx[i] - prevSmIdx[i] - 1;
            int area = height * width;
            max = Math.max(max, area);
        }
        return max;
    }
}
