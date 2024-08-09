package arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 5, 8, 9, 30, 45};
        int[] array2 = {4, 5, 5, 6, 7, 8, 9, 10};

        int[] result = intersection(array1, array2);

        System.out.print("Intersection of arrays: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] intersection(int[] array1, int[] array2) {
        int[] tempResult = new int[Math.min(array1.length, array2.length)];
        int i = 0, j = 0, k = 0;

        // Traverse both arrays using for loops
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                tempResult[k++] = array1[i];
                i++;
                j++;
            }
        }

        // Resize the result array to fit the actual number of elements
        int[] finalResult = new int[k];
        for (int l = 0; l < k; l++) {
            finalResult[l] = tempResult[l];
        }

        return finalResult;
    }
}
