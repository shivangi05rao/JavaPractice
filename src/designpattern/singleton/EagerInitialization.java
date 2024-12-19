package designpattern.singleton;

//EagerInitialization
public class EagerInitialization {
    private static EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){

    }

    private static EagerInitialization getInstance() {
        return instance;
    }

//    public static void main(String[] args) {
//        EagerInitialization connection = EagerInitialization.getInstance();
//    }
}
