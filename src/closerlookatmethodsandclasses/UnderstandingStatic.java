package closerlookatmethodsandclasses;

class UnderstandingStatic {
    static int a = 42;
    static int b = 99;

    static void callMe(){
        System.out.println("a = " + a);
    }
}
class StaticByName{
    public static void main(String[] args) {
        UnderstandingStatic.callMe();
        System.out.println("b = " + UnderstandingStatic.b);
    }
}

// static int a = 3;
//    static int b;
//
//    static void meth(int x) {
//        System.out.println("x = " + x);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//    }
//
//    static {
//        System.out.println("Static block initialized. ");
//        b = a * 4;
//    }
//
//    public static void main(String[] args) {
//        meth(42);
//    }
