package arrays;

public class CheckFibonacciSequence {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 60, 987, 1597, 2584, 4181};
        //int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};

        if (arr.length != 20){
            System.out.println("invalid size of array: ");
            return;
        }

        for (int i = 2; i < arr.length; i++){
            if (arr[i] != arr[i-1] + arr[i-2]){
                System.out.println("It's not a Fibonacci sequence due to the value " + arr[i] + " at index " + i);
                return;
            }
        }
        System.out.println("Hurrah ... we've got a Fibonacci sequence.");
    }
}
