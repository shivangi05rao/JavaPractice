package test;

abstract class Animal {
    abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}



