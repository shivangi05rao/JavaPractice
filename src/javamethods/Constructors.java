package javamethods;

class Calc{

    int a;
    int b;

    Calc(int x, int y){ //Parameterized constructor
        a = x;
        b = y;
    }

    int add(){
        return a + b;
    }

    int sub(){
        return a - b;
    }

    int mul(){
        return a * b;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Calc ob1 = new Calc(5, 7);
        System.out.println(ob1.add());
        System.out.println(ob1.sub());
        System.out.println(ob1.mul());

        Calc ob2 = new Calc(4,4);
        System.out.println(ob2.add());
        System.out.println(ob2.sub());
        System.out.println(ob2.mul());
    }
}
