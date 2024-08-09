package oops.inheritance;

public class inherit {

    //create superclass
    static class A {
        int i;
        int j;
        void showij() {
            System.out.println("i and j: " + i + " " + j);
        }
    }

    //create a subclass by extending claas A
    static class B extends A{
        int k;

        void showk(){
            System.out.println("k: " + k);
        }
        void sum(){
            System.out.println("i+j+k: " + (i+j+k));
        }
    }

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //the superclass may be used by itself.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        // The subclass has access to all public members of its superclass
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j, k in subOb: ");
        subOb.sum();
    }
}
