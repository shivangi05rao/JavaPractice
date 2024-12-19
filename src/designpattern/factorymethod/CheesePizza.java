package designpattern.factorymethod;

//Concrete Product
class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }
}

class VeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
    }
}
