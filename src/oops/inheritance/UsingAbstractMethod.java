package oops.inheritance;

//A simple demonstration of abstract
abstract class Ab {
    abstract void callMe();

    //concrete methods are still allowed in abstract classes
    void callMeToo(){
        System.out.println("This is a concrete method");
    }
}

class Cd extends Ab{
    void callMe(){
        System.out.println("cd's implementation of callMe.");
    }
}
public class UsingAbstractMethod {
    public static void main(String[] args) {
        Cd cd = new Cd();

        cd.callMe();
        cd.callMeToo();
    }
}
