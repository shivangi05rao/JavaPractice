package examples;

import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ram's age: ");
        int ram = sc.nextInt();
        System.out.println("Enter Shyam's age: ");
        int shyam = sc.nextInt();
        System.out.println("Enter Ajay's age: ");
        int ajay = sc.nextInt();

        if (ram<shyam){
            if (ram<ajay){
                System.out.println("Youngest is Ram");
            } else {
                System.out.println("Youngest is Ajay");
            }
        } else if (shyam<ram){
            if (shyam<ajay){
                System.out.println("Youngest is Shyam");
            }else {
                System.out.println("Youngest is Ajay");
            }
        }
    }
}
