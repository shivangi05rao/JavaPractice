package oops.inheritance;

public class InheritUsingAccessModifiers {
    /**
     * In a class hierarchy, private members remain private to their class.
     * This program has an error and will not compile after removing the comment it will show an error
     */
    //create super class
    static class A{
        int i ;
        private int j;

        void setij(int i, int j){
            this.i = i;
            this.j = j;
        }
    }

    //A's j is not accessible here
    static class B extends A{
        int total;

        void sum(){
            //total = i + j; //Error, j is not accessible here
        }
    }

    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Total is: " + subOb.total);
    }
}
