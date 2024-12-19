package designpattern.builder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        HouseDirector director1 = new HouseDirector(woodenHouseBuilder);
        director1.constructHouse();
        ProductHouse woodenHouse = woodenHouseBuilder.getResult();
        System.out.println("Wooden house created: " + woodenHouse);

        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        HouseDirector director2 = new HouseDirector(concreteHouseBuilder);
        director2.constructHouse();
        ProductHouse concreteHouse = concreteHouseBuilder.getResult();
        System.out.println("Concrete house constructed: " + concreteHouse);
    }
}
