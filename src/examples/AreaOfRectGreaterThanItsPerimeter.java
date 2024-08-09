package examples;

import java.util.Scanner;

public class AreaOfRectGreaterThanItsPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 *(length + breadth);
        System.out.println("Area of rectangle: "+area);
        System.out.println("Perimeter of rectangle: "+perimeter);
        if (area > perimeter){

            System.out.println("Area of rectangle is greater than it's perimeter");
        } else if (perimeter > area){
            System.out.println("Perimeter of rectangle is greater than it's area");
        } else {
            System.out.println("Both are equal.");
        }
    }
}
