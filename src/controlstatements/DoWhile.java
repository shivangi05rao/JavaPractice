package controlstatements;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("Value of i: " + i);
            i++;
        } while (i < 5);

        System.out.println("After the do-while loop.");
    }
}
