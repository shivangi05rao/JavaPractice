package objectOrientedProgramming.abstraction.methodsInInterface.staticMethod;

public interface Vehicle {
    static void cleanVehicle() {
        System.out.println("Clean Vehicle");
    }
}

class Car implements Vehicle {
    public static void main(String[] args) {
        //Car car = new Car();
        Vehicle.cleanVehicle();
    }
}