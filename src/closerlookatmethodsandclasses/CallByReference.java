package closerlookatmethodsandclasses;
class Test2{
    int i, j;
    Test2(int i, int j){
        this.i = i;
        this.j = j;
    }

    //pass an object
    void meth(Test2 o){
        o.i *= 2;
        o.j /= 2;
    }
}

public class CallByReference {
    public static void main(String[] args) {
        Test2 t = new Test2(15, 20);
        System.out.println("t.i and t.j before call: " + t.i + " " + t.j);
        t.meth(t);
        System.out.println("t.i and t.j after call: " + t.i + " " + t.j);
    }
}
