package designpattern.builder;

//Concrete Builder
class WoodenHouseBuilder implements HouseBuilder{
    private ProductHouse house = new ProductHouse();


    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden Foundation");
    }

    @Override
    public void buildWall() {
        house.setWalls("Wooden Walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden Roof");
    }

    @Override
    public ProductHouse getResult() {
        return house;
    }
}

class ConcreteHouseBuilder implements HouseBuilder{
    private ProductHouse house = new ProductHouse();

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
    }

    @Override
    public void buildWall() {
        house.setWalls("Concrete Walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete Roof");
    }

    @Override
    public ProductHouse getResult() {
        return house;
    }
}
