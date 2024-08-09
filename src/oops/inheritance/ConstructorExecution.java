package oops.inheritance;

//Create a super class
class Sup{
    Sup(){
        System.out.println("Inside super's constructor.");
    }
}

//Create a subclass
class Sub extends Sup{
    Sub(){
        System.out.println("Inside sub's constructor.");
    }
}

class C extends Sub{
    C(){
        System.out.println("Inside C's constructor.");
    }
}
public class ConstructorExecution {
    public static void main(String[] args) {
        C c = new C();
    }
}
