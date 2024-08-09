package oops.inheritance;

class P{
    int i, j;
    P(int i, int j){
        this.i = i;
        this.j = j;
    }

    //display i and j
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

//create a subclass by extending class P
class S extends P{
    int k;

    S(int i, int j, int k){
        super(i, j);
        this.k = k;
    }

    //Overload show()
    void show(String msg){
        System.out.println(msg + k);
    }
}
public class WhenMethOverNotOccurs {
    public static void main(String[] args) {
        S subOb = new S(1, 2, 3);

        subOb.show("This is k: "); //this calls show() in S
        subOb.show(); //this calls show() in P
    }
}
