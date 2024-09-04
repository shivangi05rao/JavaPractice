package objectOrientedProgramming.association;

class Vehicle {
    int id;
    String model;
    public Vehicle(int id, String model) {
        this.id = id;
        this.model = model;
    }
}

class Driver {
    String driverName;
    Vehicle vehicle;

    Driver(String name, Vehicle v) {
        this.driverName = name;
        vehicle = v;
    }
}


class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4453, "Volvo S60");
        Driver driver = new Driver("Draco", vehicle);
        System.out.println(driver.driverName + " is a driver of car id: " + driver.vehicle.id);
    }
}