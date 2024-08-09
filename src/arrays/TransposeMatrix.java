package arrays;

import java.util.Scanner;

public class TransposeMatrix {


    static void TransposeInPlace(int[][] matrix, int r, int c) {

        //Will only work for square matrices
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static int[][] Transpose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }


    static void printMatrixArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and cols of matrix 1: ");
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r*c + " elements: ");

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        printMatrixArray(matrix);


//        System.out.println("Transpose Matrix: ");
//        int[][] ans = Transpose(matrix, r, c);
//        printMatrixArray(ans);

        //for in place
        System.out.println("Transpose Matrix: ");
        TransposeInPlace(matrix, r, c);
        printMatrixArray(matrix);
    }
}
