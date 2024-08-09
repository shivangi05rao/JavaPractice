package sorts;

public class BubbleSortPw {

    static void bubbleSort(int[] arr){
        int n = arr.length;
        //n-1 iterations
        boolean flag = false; //No Swaps
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                //Last elements are already sorted so there is no need to check them
                if (arr[j] < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; //Some swap has happened
                }
            }
            if (!flag){ //if(flag == false)
                return;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " "); //OR for (int i = 0; i < arr.length; i++){ System.out.print(arr[i] + " "); }
        }
    }
}
