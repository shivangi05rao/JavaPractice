package oops.inheritance;

    class A{
        int i;
    }

    //Create a subclass by extending class A.
    class B extends A{
        int i; //this i, hide the i in class A

        B(int a, int b){
            super.i = a;
            i = b;
        }

        void show(){
            System.out.println("i in super class: " + super.i);
            System.out.println("i in subclass: " + i);
        }
    }
public class SecondUseOfSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
