package objectOrientedProgramming.abstraction.methodsInInterface.defaultMethod.caveat;

interface InterfaceA {
    default void printSomething() {
        System.out.println("InterfaceA");
    }
}

interface InterfaceB {
    default void printSomething() {
        System.out.println("InterfaceB");
    }
}

class MainAB implements InterfaceA, InterfaceB {
    public void printSomething() {
        //Option 1 -> Provide our own implementation
        System.out.println("I am inside main class");

        //Option 2 -> Use existing implementation from interfaceA or interfaceB or both.
        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }

    public static void main(String[] args) {
        MainAB main = new MainAB();
        main.printSomething();
    }
}