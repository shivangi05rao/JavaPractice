package arrays.linearsearch;

public class Search {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = search(new int[] {2, 3, 4, 10, 40}, 4);
        System.out.println(res);
    }
}
