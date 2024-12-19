package designpattern.builder;

public interface HouseBuilder {
    void buildFoundation();
    void buildWall();
    void buildRoof();
    ProductHouse getResult();
}
