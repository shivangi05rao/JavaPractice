package java8.defaultMethod;

public interface InterfaceA {
    default void printSomething(){
        System.out.println("I'm int interface A");
    }
}
