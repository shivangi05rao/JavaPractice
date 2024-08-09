package recursion;

import java.util.Scanner;

public class recursionFactN {

    static int fact(int n){
        //base case
        if (n == 0){
            return 1;
        }
        //sub prob --> recurrence work
        int subProb = fact(n-1);
        //self Work
        return n*subProb;           // return n * fact(n-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);

    }


}
