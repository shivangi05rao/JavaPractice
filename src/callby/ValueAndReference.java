package callby;

//pass by value --> Copies the value of actual parameters, called function creates its own copy
//Pass by reference --> Passes the parameter as reference (address) no copies are created, called function
//does not create its own copy

public class ValueAndReference {
//    static int sum(int a, int b){
//        return a + b;
//    }
    static  void changeValue(int a){
        a *= 100;
        System.out.println("Inside class value: " + a);
    }
    public static void main(String[] args) {
        //value.sum(5, 10);
        int a = 10;
        System.out.println("Before changing value: " + a);
        changeValue(a);
        System.out.println("After changing value: " + a);
    }
}
