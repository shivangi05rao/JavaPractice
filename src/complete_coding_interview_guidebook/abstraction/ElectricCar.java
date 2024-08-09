package complete_coding_interview_guidebook.abstraction;

public class ElectricCar implements Car {

    private final String carType;

    public ElectricCar(String carType){
        this.carType = carType;
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the electric car");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the electric car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn right the electric car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn left the electric car");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }

    public static void main(String[] args) {
        Car electricCar = new ElectricCar("BMW");

        System.out.println("Driving the electric car: " + electricCar.getCarType());

			electricCar.speedUp();
			electricCar.turnLeft();
			electricCar.slowDown();
    }
}
