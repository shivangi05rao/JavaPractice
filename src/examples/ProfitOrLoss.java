package examples;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price: ");
        int price = sc.nextInt();
        System.out.println("Enter selling price: ");
        int sellingPrice = sc.nextInt();
        if (sellingPrice>price){
            System.out.println("Profit of: " + (sellingPrice-price));
        } else {
            System.out.println("Loss of: " + (price-sellingPrice));
        }
    }
}
