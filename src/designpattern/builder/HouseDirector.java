package designpattern.builder;

public class HouseDirector {
    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void constructHouse() {
        builder.buildFoundation();
        builder.buildWall();
        builder.buildRoof();
    }
}
