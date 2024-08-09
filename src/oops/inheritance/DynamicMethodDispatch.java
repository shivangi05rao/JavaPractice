package oops.inheritance;

class X{
    void callMe(){
        System.out.println("Inside X's call me method.");
    }
}

class Y extends X{
    //override call me
    void callMe(){
        System.out.println("Inside Y's call me method.");
    }
}

class Z extends Y{
    //Override call me
    void callMe(){
        System.out.println("Inside Z's call me method.");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        X x = new X(); //object of X
        Y y = new Y(); //object of Y
        Z z = new Z(); //object of Z

        X r; //Obtain a reference of type X
        r = x; // r refers to an X object
        r.callMe();

        r = y; // Obtain a reference of type Y
        r.callMe(); // r refers to a Y object

        r = z; // Obtain a reference of type Z
        r.callMe(); // r refers to a Z object
    }
}
