package sorts;

public class SelectionSortPw {

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) { // i represent the current index
            //Find the min element in unsorted part of the array
            int min_index = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            //swap current element and minimum element --> current index will have correct element
            //arr[min_index], arr[i]
            if (min_index!= i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }


    public static void main(String[] args) {
       int[] arr = {7, 5, 4, 1, 2};
       selectionSort(arr);
       for (int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }
    }
}
