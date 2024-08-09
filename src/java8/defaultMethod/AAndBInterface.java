package java8.defaultMethod;

public class AAndBInterface implements InterfaceA, InterfaceB{
    @Override
    public void printSomething() {
        System.out.println("I'm in main class");

        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }

    public static void main(String[] args) {
        AAndBInterface aAndBInterface = new AAndBInterface();
        aAndBInterface.printSomething();
    }
}
