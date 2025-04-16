package LogicBuildingGfg.easyprobs;

public class FloorSquareRoot {
    static int floorSqrt(int n) {
        int res = 1;
        while (res * res <= n) {
            res++;
        }
        return res - 1;
    }

    //Using binary Search
    static int floorSqrtBinarySearch(int n) {
        int low = 1;
        int high = n;
        int res = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid * mid <= n) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    } //Time Complexity – O(logn)
    //Auxiliary Space – O(1)

    //Using Built-in functions
    static int floorSqrtBuiltIn(int n) {
        return (int) Math.sqrt(n);
    } //Time Complexity – O(logn)
    //Auxiliary Space – O(1)

    //Using Formula Used by Pocket Calculators
    static int floorSqrtFormula(int n) {
        int res = (int) Math.exp(0.5 * Math.log(n));

        if ((res + 1) * (res + 1) <= n) {
            res++;
        }
        return res;
    } //Time Complexity – O(1) Time
    //Auxiliary Space – O(1)

    public static void main(String[] args) {
        System.out.println(floorSqrt(4));
        System.out.println(floorSqrtBinarySearch(11));
        System.out.println(floorSqrtBinarySearch(11));
        System.out.println(floorSqrtFormula(4));
    }
}
