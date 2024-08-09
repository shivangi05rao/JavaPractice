package bitmanipulation;

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        //Get Bit (Using & AND)
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0){
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }

        //Set Bit (Using | OR)
        int n1 = 5;
        int pos1 = 1;
        int bitMask1 = 1<<pos1;
        int num = bitMask1 | n1;
        System.out.println(num);

        //Clear Bit (Using AND & and NOT !)(first use NOT and then AND)
        int n2 = 5;
        int pos2 = 2;
        int bitMask2 = 1<<pos2;
        int notBitMask2 = ~(bitMask2);
        int num1 = notBitMask2 & n2;
        System.out.println(num1);

        //Update Bit (Using (for 0 == AND and NOT) (For == 1 OR))
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter either 0 or 1: ");
        int opr = sc.nextInt(); //(Either 0 or 1)
        int n3 = 5;
        int pos4 = 1;
        int bitMask3 = 1<<pos4;
        if (opr == 1){
            //set
        int num2 = bitMask3 | n3;
        System.out.println(num2);
        } else {
            //clear
            int notBitMask4 = ~(bitMask3);
           int num3 = notBitMask4 & n3;
            System.out.println(num3);
        }
    }
}
