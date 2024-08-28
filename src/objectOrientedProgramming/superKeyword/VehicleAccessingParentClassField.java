package objectOrientedProgramming.superKeyword;

public class VehicleAccessingParentClassField {
    int fuelCap = 90;
}

class Car extends VehicleAccessingParentClassField {
    int fuelCap = 50;
    public void display(){
        System.out.println("Fuel capacity from vehicle class: " + super.fuelCap);
        System.out.println("Fuel capacity from car class: " + this.fuelCap);
    }
}

class VehicleMain {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.display();
    }
}
