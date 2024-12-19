package designpattern.builder;

public class ProductHouse {
    private String foundation;
    private String walls;
    private String roof;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof){
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House [Foundation = " + foundation + ", Walls = " + walls + ", Roof = " + roof + "]";
    }
}
