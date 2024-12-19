package InterviewCondingQuestions;

public class InadevTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        //4, 5, 1, 2, 3
        //System.out.println(Arrays.hashCode(arr));
        rotateArray(arr, k);
        System.out.println("Result: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        rev(arr, 0, n - 1); // 5, 4, 3, 2, 1
        rev(arr, 0, n - k - 1); //4, 5, 3, 2, 1
        rev(arr, n - k, n - 1); // 4, 5, 1, 2, 3
    }

    public static void rev(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
