package solidprinciples.examples;

/// Dependency Inversion Principle
interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Start typing.....");
    }
}

class BluetoothKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Start typing.....");
    }
}


interface Mouse {
    void move();
}

class WiredMouse implements Keyboard {

    @Override
    public void type() {
        System.out.println("Start moving.....");
    }
}

class BluetoothMouse implements Keyboard {

    @Override
    public void type() {
        System.out.println("Start moving.....");
    }
}

//public class Macbook {
//    private final WiredKeyboard keyboard;
//    private final WiredMouse mouse;
//
//    public Macbook() {
//        keyboard = new WiredKeyboard();
//        mouse = new WiredMouse();
//    }
//}

public class Macbook {
    private final Keyboard keyboard;
    private final Mouse mouse;


    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}



