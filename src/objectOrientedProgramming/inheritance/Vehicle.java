package objectOrientedProgramming.inheritance;

public class Vehicle {
    private final String make;
    private final String color;
    private final int year;
    private final String model;

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Make : " + make);
        System.out.println("Color : " + color);
        System.out.println("Year : " + year);
        System.out.println("Model : " + model);
    }

    static class Car extends Vehicle {
        private final String bodyStyle;

        public Car(String make, String color, int year, String model,  String bodyStyle){
            super(make, color, year, model);
            this.bodyStyle = bodyStyle;
        }

        public void carDetails() {
            printDetails();
            System.out.println("BodyStyle : " + bodyStyle);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Hyundai", "Red", 2019, "Vintage", "Sedan");
        c1.carDetails();
    }
}
