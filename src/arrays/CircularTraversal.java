package arrays;

class CircularTraversal {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {2, 8, 3, 15}; // Array for circular traversal
        int n = a.length;
        int i = 0;

        while (true) {
            if (a[i] > 0) {
                System.out.println("Now PROCESSING the index " + i);
                int steps = a[i];
                a[i] = -a[i]; // Mark element as negative

                // Move forward 'steps' positions in a circular manner
                for (int k = 0; k < steps; k++) {
                    i = (i + 1) % n;
                }
            } else {
                boolean allNegative = true;
                for (int j = 0; j < n; j++) {
                    if (a[j] > 0) {
                        allNegative = false;
                        break;
                    }
                }
                if (allNegative) {
                    break;
                } else {
                    i = (i + 1) % n;
                }
            }
            printArray(a);
        }
    }
}

