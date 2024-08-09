package oops.inheritance;

class Parent{
    int i, j;
    Parent(int i, int j){
        this.i = i;
        this.j = j;
    }

    //display i and j
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

class Child extends Parent{
    int k;

    Child(int i, int j, int k){
        super(i, j);
        this.k = k;
    }
     //display k this overrides show() in Parent
    void show(){
        super.show(); //this calls Parent's show
        System.out.println("k: " + k);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Child sub =  new Child(1, 2, 3);
        sub.show(); //this calls show in Child
    }
}
