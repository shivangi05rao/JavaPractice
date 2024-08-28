package objectOrientedProgramming.superKeyword;

public class VehicleCallingParentClassMethod {
    public void display() {
        System.out.println("This is a vehicle method");
    }
}

class Car1 extends VehicleCallingParentClassMethod {
    public void display() {
        System.out.println("This is a car method");
    }

    public void print(){
        System.out.println("The display call with super");
        super.display();
        System.out.println("The display() call without super" );
        display();
    }

    public static void main(String[] args) {
        Car1 car = new Car1();
        car.print();
    }
}
