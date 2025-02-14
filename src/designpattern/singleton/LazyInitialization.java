package designpattern.singleton;

//LazyInitialization
public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello I'm Singleton with lazy initialization!");
    }

    public static void main(String[] args) {
        LazyInitialization singleton = LazyInitialization.getInstance();
        LazyInitialization singleton2 = LazyInitialization.getInstance();
        System.out.println(singleton == singleton2);
        singleton.showMessage();
    }
}


