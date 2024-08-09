package complete_coding_interview_guidebook.encapsulation;

public class Cat {

    private int mood = 50;
    private int hungry = 50;
    private int energy = 50;

    public void sleep(){
        System.out.print("Sleep ...");
        energy++;
        hungry++;
        meow();
    }

    public void play(){
        System.out.print("Play ...");
        mood++;
        energy--;
        meow();
    }

    public void feed(){
        System.out.print("Feed ...");
        hungry--;
        mood++;
        meow();
    }

    private void meow() {
        System.out.println("Meow!");
    }

    public int getMood() {
        return mood;
    }

    public int getHungry() {
        return hungry;
    }

    public int getEnergy() {
        return energy;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.feed();
        cat.play();
        cat.feed();
        cat.sleep();

        System.out.println("Energy: " + cat.getEnergy());
        System.out.println("Mood: " + cat.getMood());
        System.out.println("Hungry: " + cat.getHungry());
    }
}

//Encapsulation is one of the core concepts of OOP.
//	Mainly, encapsulation binds the code and the data of class and acts as a defensive shield that doesn't allow external code to access this data directly.
//	It is a technique of hiding the object state from the outer world and exposing a set of public methods for accessing this state.
//	When each object keeps its state private inside a class, we can say encapsulation is achieved.
//	This is why encapsulation is referred as DATA-HIDING mechanism,
//		For example,
//				A Cat class can have its own state such as mood, hungry and energy while the code external to the Cat class can't modify any of these fields directly,
//				it can call public methods such as play(), feed(), and sleep() that modify the cat state internally.
//				The cat class may also have private methods that are not accessible outside the class, such as meow(). This is encapsulation.
