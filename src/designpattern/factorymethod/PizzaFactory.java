package designpattern.factorymethod;

//Creator(Factory)
abstract class PizzaFactory {
    abstract Pizza createPizza();
}

//Concrete Creators
class CheesePizzaFactory extends PizzaFactory {

    @Override
    Pizza createPizza() {
        return new CheesePizza();
    }
}

class VeegiePizzaFactory extends PizzaFactory {
    @Override
    Pizza createPizza() {
        return new VeggiePizza();
    }
}