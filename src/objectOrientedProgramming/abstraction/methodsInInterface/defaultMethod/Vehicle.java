package objectOrientedProgramming.abstraction.methodsInInterface.defaultMethod;

public interface Vehicle {
    void cleanVehicle();

    default void startVehicle() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Car is cleaning...");
    }
}

class driver {
    public static void main(String[] args) {
        Car car = new Car();
        car.startVehicle();
        car.cleanVehicle();
    }
}
