package arrays;

import java.util.Scanner;

public class AddMultiDimensionArray {

    static void swap(int[][] arr,int i,int start,int end ){
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;
    }

    static void reveresOfMatrix(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            int start=0;
            int end=c-1;
            while(start < end){
                swap(arr,i,start,end);
                start++;
                end--;
            }
        }
    }
    static void printMatrixArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if (c1 != r2){
            System.out.println("Entered wrong input multiplication not possible");
            return;
        }

        int[][] multiple = new int[r1][c2];

        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                for (int k = 0; k < c1; k++) {
                    multiple[i][j] = a[i][k] * b[k][j];
                }
            }
        }
        printMatrixArray(multiple);
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("Entered wrong input addition not possible");
            return;
        }

        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        printMatrixArray(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and cols of matrix 1: ");
        System.out.println("Enter number of rows: ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter " + r1*c1 + " elements: ");

        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                    a[i][j] = sc.nextInt();
            }
        }

        reveresOfMatrix(a, r1, c1);
        printMatrixArray(a);

//        System.out.println("Enter number of rows and cols of matrix 2: ");
//        System.out.println("Enter number of rows: ");
//        int r2 = sc.nextInt();
//        System.out.println("Enter number of cols: ");
//        int c2 = sc.nextInt();
//
//        int[][] b = new int[r2][c2];
//        System.out.println("Enter " + r2*c2 + " elements: ");
//
//        for (int i = 0; i < r2; i++){
//            for (int j = 0; j < c2; j++){
//                b[i][j] = sc.nextInt();
//            }
//        }

//        System.out.println("Matrix 1: ");
//        printMatrixArray(a);
//        System.out.println("Matrix 2: ");
//        printMatrixArray(b);

//        System.out.println("Sum of matrix: ");
//        add(a, r1, c1, b, r2, c2);

//        System.out.println("Multiplication of matrix: ");
//        multiply(a, r1, c1, b, r2, c2);
    }
}
