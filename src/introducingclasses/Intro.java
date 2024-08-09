package introducingclasses;

class Box {
    double width;
    double height;
    double depth;

    //display volume of a box
    double volume() {
        return (width * height * depth);
    }

    //sets dimensions of the box method
//    void setDim(double width, double height, double depth) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }

    //Default constructor
    Box(){

    }
    //Parameterized Constructor
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 15);
        Box b2 = new Box(3, 6, 9);
        double vol;

//        b1.width = 3;
//        b1.height = 6;
//        b1.depth = 9;

//        b2.width = 10;
//        b2.height = 20;
//        b2.depth = 15;

        //initializing each box
//        b1.setDim(3, 6, 9);
//        b2.setDim(10, 20, 15);

        //returning a value
        vol = b1.volume();
        System.out.println("Volume of b1 is: " + vol);
        vol = b2.volume();
        System.out.println("Volume of b2 is: " + vol);
    }
}
