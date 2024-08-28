package objectorientedprogramming.superKeyword;

class VehicleUsingWithConstructors {
    private String make;
    private String color;
    private int year;
    private String model;

    public VehicleUsingWithConstructors(String make, String color, int year, String model) {
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
}

class Car3 extends VehicleUsingWithConstructors {
    private String bodyStyle;

    public Car3(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {
        printDetails();
        System.out.println("BodyStyle : " + bodyStyle);
    }

    public static void main(String[] args) {
        Car3 car3 = new Car3("Hyundai", "RED", 2032, "Elantra", "Sedan");
        car3.carDetails();
    }
}


