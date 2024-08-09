package arrays;

class DistinctValuesInAnArray {
    static void printArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int[] p = {2, 5, 5, 8, 8, 8, 9, 30, 45}; // Input array
        int lp = p.length; // Length of array p
        int[] r = new int[lp]; // Result array, initially assuming the worst case of all unique elements
        int k = 0; // Index for the result array r

        // Sorting the input array (if necessary, uncomment below)
        // Arrays.sort(p);

        if (lp != 0) {
            r[k++] = p[0]; // Store the first element of p in r
        }

        // Loop through the elements of p to find unique elements
        for (int i = 1; i < lp; i++) {
            if (p[i] != p[i - 1]) { // Check if a current element is different from previous
                r[k++] = p[i]; // Store unique element in r and increment k
            }
        }

        // Printing original array p
        printArray(p, p.length);

        // Printing array r containing unique elements
        printArray(r, k);
    }
}
