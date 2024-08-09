package closerlookatmethodsandclasses;

// Here Box defines three constructors to initialize the dimensions of the Box
class Box {
    double width;
    double height;
    double depth;

    //Constructor used when all dimensions specified
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //Constructor used when no dimensions are specified
    Box() {
        width = -1;
        height = -1;
        depth =-1;
    }

    //Constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    //Compute and return volume
    double volume() {
        return width * height * depth;
    }
}
public class OverloadingConstructor {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 15);
        Box b2 = new Box(3, 6, 9);
        double vol;
        vol = b1.volume();
        System.out.println("Volume of Box1 is: " + vol);
        vol = b2.volume();
        System.out.println("Volume of Box2 is: " + vol);


    }
}
