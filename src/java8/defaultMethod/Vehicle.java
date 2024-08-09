package java8.defaultMethod;

public interface Vehicle {
    void cleanVehicle();
    default void startVehicle(){
        System.out.println("Start the vehicle!");
    }
}
