package java8.defaultMethod;

public class Car implements Vehicle{

    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.cleanVehicle();
        car.startVehicle();
    }
}
