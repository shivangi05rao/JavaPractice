package oops.homeinterviewquestions;

public abstract class Animal {
    abstract void sound();
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}

interface Vehicle {
    void start();
    void stop();
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }

    public String xyz(int x, int y){
        return "Method with two int parameters called.";

    }

    public static void main(String[] args) {
        
    }
}