package closerlookatmethodsandclasses;
class Test5{
    int a; //default access
    public int b; //public access
    private int c; //private access

    //methods to access c
    void setC(int c){   //set c's value
        this.c = c;
    }
    int getC(){ //get c's value
        return c;
    }
}
public class AccessControl {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        //These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        //This is not OK and will cause an error
        //ob.c = 100; //Error!

        //You must access c through its methods
        ob.setC(100); //OK
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
