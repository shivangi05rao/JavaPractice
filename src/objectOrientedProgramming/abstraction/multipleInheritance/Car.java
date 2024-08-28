package objectOrientedProgramming.abstraction.multipleInheritance;

public class Car {
    private int model;
    private String manufacturer;

    public Car(int model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void printDetails() {
        System.out.println("The model of " + getClass().getSimpleName() + " is " + model);
        System.out.println("The manufacturer of " + getClass().getSimpleName() + " is " + manufacturer);
    }
}

interface IsSedan {
    int bootSpace = 420;

    void bootSpace();
}

class Elantra extends Car implements IsSedan {
    private String variant;

    public Elantra(int model, String variant) {
        super(model, "Hyundai");
        this.variant = variant;
    }

    @Override
    public void bootSpace() {
        System.out.println("The bootspace of Elantra is " + IsSedan.bootSpace + " liters");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("The variant of Elantra is: " + variant);
    }
}

class Main {
    public static void main(String[] args) {
        Elantra sport = new Elantra(2019, "Sedan");
        Elantra eco = new Elantra(2018, "Eco");
        sport.printDetails();
        sport.bootSpace();
        System.out.println();
        eco.printDetails();
        eco.bootSpace();
    }
}
