package objectOrientedProgramming.inheritance.questions;

public class VehicleImplementDerivedClass {
    //Question:  Implement a function getDetails(String carName) of the Derived Class Car which takes a string carName
// and appends it with model, name, and speed. We have already implemented the
// Base Class Vehicle with the member functions getModel() and getSpeed() which return the model and speed of the car respectively.
//Input
//Car Name
//Output
//Car Name, Model, Speed
    private String model;
    private int speed;

    public VehicleImplementDerivedClass() {
        speed = 100;
        model = "Tesla";
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends VehicleImplementDerivedClass {
    public String name;
    public Car() {
        name = "";
    }

    public String getDetails(String name){
        return name + ", " + getModel() + ", " + getSpeed();
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getDetails("Roadster"));
    }
}
