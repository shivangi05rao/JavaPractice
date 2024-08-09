package closerlookatmethodsandclasses;
//Primitive types are passed by value
class Test1{
    void meth(int i, int j){
        i = i * 2;
        j = j / 2;
    }
}
public class CallByValue {
    public static void main(String[] args) {
     Test1 t = new Test1();
     int i = 15, j = 20;
        System.out.println("i and j before call: " + i + " " + j);
        t.meth(i, j);
        System.out.println("i and j after the call: " + i + " " + j);
    }
}
