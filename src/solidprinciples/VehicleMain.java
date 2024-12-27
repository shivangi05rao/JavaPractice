package solidprinciples;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    public Integer getNumbersOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}

class Motorcycle extends Vehicle {

}

class Car extends Vehicle {
    @Override
    public Integer getNumbersOfWheels() {
        return 4;
    }
}

class Bicycle extends Vehicle {
    public Boolean hasEngine() {
        return null;
    }
}

//Taking only generous method in parent class.
class Vehicle2 {
    public Integer getNumbersOfWheels() {
        return 2;
    }
}

class EngineVehicle extends Vehicle2 {
    public boolean hasEngine() {
        return true;
    }
}

class Bicycle2 extends Vehicle2 {
}

class Motorcycle2 extends EngineVehicle {
}

class Car2 extends EngineVehicle {
}

public class VehicleMain {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Motorcycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle()); //Breaks the implementation of code against Liskov Substitution if method is not generic

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getNumbersOfWheels().toString());
        }

//        List<Vehicle2>  vehicle2List = new ArrayList<>();
//        vehicle2List.add(new Motorcycle2());
//        vehicle2List.add(new Car2());
//        vehicle2List.add(new Bicycle2());
//        for (Vehicle2 vehicle : vehicle2List) {
//            System.out.println(vehicle.hasEngine().toString());  //unable to access because Vehicle2 is not aware of this method
//        }
//
//        List<EngineVehicle>  engineVehicles = new ArrayList<>();
//        engineVehicles.add(new Motorcycle2());
//        engineVehicles.add(new Car2());
//        engineVehicles.add(new Bicycle2()); //compile time error because bicycle doesn't inherit EngineVehicle
//        for (Vehicle2 vehicle : vehicle2List) {
//            System.out.println(vehicle.hasEngine().toString());  //unable to access because Vehicle2 is not aware of this method
//        }
    }
}

