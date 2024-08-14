package objectorientedprogramming.abstraction;
interface Animals {
    int eyes = 2;

    void walk();
}
interface Herbivore{

}
class Horses implements Animals, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class AnimalIn {
    public static void main(String[] args) {
        Horses h1 = new Horses();
        h1.walk();
    }
}
//Static Keyword --> used to make something belong to the class itself instead of belonging to individual
// objects (instances) of the class. It's like having a shared resource that can be accessed
// by all instances of the class, and you don't need to create an object to use it. This can be a variable or a method.