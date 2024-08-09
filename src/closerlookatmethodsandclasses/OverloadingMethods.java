package closerlookatmethodsandclasses;
//demonstrate method overloading
class OverloadDemo{
    void test(){
        System.out.println("No Parameter");
    }

    //Overload test for one integer parameter
    void test(int a){
        System.out.println("a: " + a);
    }

    //Overload test for two integer parameter
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    //Overload test for one double parameter
    //Automatic type conversions apply
    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }
}
public class OverloadingMethods {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        //call all versions of test
        od.test();
        od.test(10);
        od.test(10, 20);
        double result = od.test(123.25);
        System.out.println("The double result is: " + result);

        int i  = 88;
        od.test(i);
        od.test(123.25);
    }
}
