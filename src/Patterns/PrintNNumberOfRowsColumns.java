package Patterns;

public class PrintNNumberOfRowsColumns {
    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n); //for * sout(*)
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(7);
    }
}
