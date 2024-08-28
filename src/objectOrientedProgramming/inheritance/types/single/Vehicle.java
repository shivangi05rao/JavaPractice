package objectOrientedProgramming.inheritance.types.single;

class Vehicle {          //Base Vehicle class

    private int topSpeed;

    public void setTopSpeed(int speed) {
        this.topSpeed = speed;
        System.out.println("The top speed is set to: " + topSpeed);
    }

}

class Car extends Vehicle { // subclass Car extending from Vehicle

    public void openTrunk() {
        System.out.println("The Car trunk is Open Now");
    }

}

class Main {

    public static void main(String[] args) {
        Car corolla = new Car();
        corolla.setTopSpeed(220);
        corolla.openTrunk();
    }

}
