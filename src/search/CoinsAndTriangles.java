package search;

import java.util.Scanner;

public class CoinsAndTriangles {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
            while (t-->0){
                long n = sc.nextInt();
                long left = 1;
                long ans = 0;
                long right = n;
                possibleHeightOfTriangle(n, left, right, ans);

            }
        }
        public static void possibleHeightOfTriangle(long n, long left, long right, long ans){
            while(left <= right){
                long mid = left + (right - left)/2;
                long curr = ((mid)*(mid+1))/2;
                if(curr <= n){
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            System.out.println(ans);
        }
}

