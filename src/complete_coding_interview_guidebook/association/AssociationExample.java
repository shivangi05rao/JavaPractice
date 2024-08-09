package complete_coding_interview_guidebook.association;

// Class representing a Car
class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

// Class representing a Person
class Person {
    private String name;
    private Car car; // Association with the Car class

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }
}

// Main class to demonstrate association
public class AssociationExample {
    public static void main(String[] args) {
        // Creating instances of Car and Person
        Car myCar = new Car("Toyota");
        Person me = new Person("John", myCar);

        // Accessing information through association
        System.out.println(me.getName() + " owns a " + me.getCar().getModel() + " car.");
    }
}
