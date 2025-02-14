package Patterns;

public class PrintNumPatterns {
    public static void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
    //for columns
    //1234
    //1234
    //1234
    //1234

    //for rows sout(i);
    //1111
    //2222
    //3333
    //4444
}
