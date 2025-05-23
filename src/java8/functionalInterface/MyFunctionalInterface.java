package java8.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String message);

    default void m1() {
        System.out.println("default method");
    }

    static void m2() {
        System.out.println("default method");
    }
}
