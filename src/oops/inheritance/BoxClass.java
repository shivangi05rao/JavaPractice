package oops.inheritance;

class Box {
    double width;
    double height;
    double depth;

    //construct clone of an object
    Box(Box ob) { //pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //Constructor used when all dimensions specified
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //Constructor used when no dimensions are specified
    Box() {
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

//Here, the Box is extended to include weight.
class BoxWeight extends Box {
    double weight; //weight of the box

    //Construct clone of an object
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    //constructor for BoxWeight
    BoxWeight(double width, double height, double depth, double weight) {
        //this.width = width;
//            this.height = height;
//            this.depth = depth;

        //Using super for using superclass constructor
        super(width, height, depth);
        this.weight = weight;
    }

    //default constructor
    BoxWeight() {

    }

    //constructor used for cube
    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}

class ColorBox extends Box {
    String color; //color of the box

    ColorBox(double width, double height, double depth, String color) {
//                this.width = width;
//                this.height = height;
//                this.depth = depth;

        //Using super for using superclass constructor
        super(width, height, depth);
        this.color = color;
    }
}

//Extend BoxWeight to include shipping cost
class Shipment extends BoxWeight {
    double cost;

    //construct clone of an object
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    //Constructor when all parameters are specified
    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    //default constructor
    Shipment() {

    }

    //Constructor used when a cube is created
    Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}

public class BoxClass {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight b2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight b3 = new BoxWeight(); //default
        BoxWeight cube = new BoxWeight(3, 2);
        BoxWeight clone = new BoxWeight(b1);
        BoxWeight cloneBoxWeight = new BoxWeight(b1.width, b1.height, b1.depth, b1.weight);

        double vol;

        vol = b1.volume();
        System.out.println("Volume of Box1 is: " + vol);
        System.out.println("Weight of Box1 is: " + b1.weight);
        System.out.println();

        vol = b2.volume();
        System.out.println("Volume of Box2 is: " + vol);
        System.out.println("Weight of Box2 is: " + b2.weight);
        System.out.println();

        vol = b3.volume();
        System.out.println("Volume of Box3 is: " + vol);
        System.out.println("Weight of Box3 is: " + b3.weight);
        System.out.println();

        vol = clone.volume();
        System.out.println("Volume of clone is: " + vol);
        System.out.println("Weight of clone is: " + clone.weight);
        System.out.println();

        vol = cube.volume();
        System.out.println("Volume of cube is: " + vol);
        System.out.println("Weight of cube is: " + cube.weight);
        System.out.println();

        ColorBox b = new ColorBox(2, 3, 4, "Red");
        System.out.println("Volume of Box3 is: " + b.volume());
        System.out.println("Color of Box3 is: " + b.color);
        System.out.println();

        //Using --> a superclass variable can reference a subclass object
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();

        vol = weightBox.volume();
        System.out.println("Volume of weightBox is: " + vol);
        System.out.println("Weight of weightBox is: " + weightBox.weight);
        System.out.println();

        //assign BoxWeight reference to Box reference
        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("Volume of plainBox is: " + vol);
        System.out.println();

        /*
        The following statement is invalid because plainBox does not define a weight member
         */
        //   System.out.println("Weight of plainBox is: " + plainBox.weight);

        //Shipment class
        Shipment s1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment s2 = new Shipment(2, 3, 4, 0.76, 1.28);

        vol = s1.volume();
        System.out.println("Volume of shipment is: " + vol);
        System.out.println("Weight of s1: " + s1.weight);
        System.out.println("Shipping cost: $" + s1.cost);
        System.out.println();

        vol = s2.volume();
        System.out.println("Volume of shipment is: " + vol);
        System.out.println("Weight of s1: " + s2.weight);
        System.out.println("Shipping cost: $" + s2.cost);
    }
}
