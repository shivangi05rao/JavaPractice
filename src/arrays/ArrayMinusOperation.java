package arrays;

public class ArrayMinusOperation {

    static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] p = {2, 5, 5, 8, 8, 8, 9, 30, 45}; // Array 1
        int[] q = {4, 5, 5, 6, 7, 7, 8, 9, 10}; // Array 2
        int[] result = arrayMinus(p, q);

        System.out.print("Array p: ");
        printArray(p, p.length);
        System.out.print("Array q: ");
        printArray(q, q.length);
        System.out.print("Result of p - q: ");
        printArray(result, result.length);
    }

    public static int[] arrayMinus(int[] p, int[] q) {
        int lp = p.length;
        int lq = q.length;
        int[] tempResult = new int[lp];
        int i = 0, j = 0, k = 0;

        while (i < lp && j < lq) {
            if (p[i] < q[j]) {
                tempResult[k++] = p[i++];
            } else if (p[i] > q[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < lp) {
            tempResult[k++] = p[i++];
        }

        int[] finalResult = new int[k];
        System.arraycopy(tempResult, 0, finalResult, 0, k);

        return finalResult;
    }
}
