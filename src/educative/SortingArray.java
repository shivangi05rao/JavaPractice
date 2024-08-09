package educative;

class SortingArray {
    public static void sortAsc(int[] arr) {
        int temp = 0; //a variable to store temporary value while swapping

        for (int i = 0; i < arr.length - 1; i++) //for loop to hold the current element to be compared
        {
            for (int j = i + 1; j < arr.length; j++) //for loop to iterate over the other elements
            { //to get them compared with the current element
                if (arr[i] > arr[j]) //if any of the higher index element is smaller than
                { //the current element
                    temp = arr[i]; //store the current element to temp
                    arr[i] = arr[j]; //store the smaller element to the lower index position
                    arr[j] = temp; //store the current element to greater index position
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {56, 9, 45, 108, 567, 21};
        System.out.println("Array values before sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        sortAsc(array);
        System.out.println("Array values after sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
