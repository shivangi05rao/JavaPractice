package java8.defaultMethod;

public interface InterfaceB {
    default void printSomething(){
        System.out.println("I'm in interface B");
    }

}
