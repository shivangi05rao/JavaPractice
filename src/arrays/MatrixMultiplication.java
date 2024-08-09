package arrays;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] b = {
                {10, 20},
                {30, 40},
                {50, 60},
                {70, 80}
        };

        int[][] c = new int[3][2];

        // Perform matrix multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;  // Initialize element c[i][j]
                for (int k = 0; k < 4; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Display the result matrix
        System.out.println("The product of matrices a and b is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

