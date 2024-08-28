package objectOrientedProgramming.abstraction.abstractClassAndMethods;

abstract class Animal {
    public abstract void makeSound();

    public void walk() {
        System.out.println(getClass().getSimpleName() + " is walking");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Sheep extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Baa");
    }
}

class AnimalDriver {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal sheep = new Sheep();
        dog.makeSound();;
        dog.walk();

        cat.makeSound();
        cat.walk();

        sheep.makeSound();
        sheep.walk();
    }
}
