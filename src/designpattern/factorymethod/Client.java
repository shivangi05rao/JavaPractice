package designpattern.factorymethod;

public class Client {
    public static void main(String[] args) {
        PizzaFactory factory;

        factory = new CheesePizzaFactory();
        Pizza cheesePizza = factory.createPizza();
        cheesePizza.prepare();

        factory = new VeegiePizzaFactory();
        Pizza veegiePizza = factory.createPizza();
        veegiePizza.prepare();
    }
}
