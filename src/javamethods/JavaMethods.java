package javamethods;

import java.util.Scanner;

class Algebra{
    int add(int a, int b){
        int ans = a + b;
        return ans;
    }
}
public class JavaMethods {
    //   block of code performing some action which runs only when it is called.
    //Write once, reuse many times, saves times, Duplicate code reducer.
    //Two types of methods in java --> User defined method, Standard Library Methods
    //How to declare methods --> access modifier(public) + return type + Method name + (Parameter list with data types){
    // code to be executed (Method body)}
    //Method Signature --> Method name + Parameter list
    //Access specifier --> specifies the access of a method --> public. protected, private, default
    //How to call a method --> Method's name();
    //Static keyword is a modifier, but it is anon access modifier
    //Static variable --> Single copy for whole class --> static int b; , object independent
    //Instance variable --> int a; , all objects will make their own copy

    // Java program to add two numbers using methods
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of input number is: ");
        int ans = obj.add(x, y);
        System.out.println(ans);
    }
}
