package recursion;

public class Recursion1 {
    public static void main(String[] args) {
        int n = 5;
        int x = 1;
        printNumbers(n);
        printNos(x);
    }
    //recursion is a function that calls itself.
    //assumes that rest of the work is completed.
    public static void printNumbers(int n) {
        //Print numbers from 5 to 1
        //Using recursion
        if (n==0)
            return;
        System.out.println(n + " ");
        printNumbers(n-1);

        //Using for loop
       // for (int i=5; i>0 ; i--){
//            System.out.print(i + " ");
        //}
    }
    public static void printNos(int x){
        if (x==6)
            return;
        System.out.println(x);
        printNos(x+1);
    }
}
