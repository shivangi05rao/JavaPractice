package accessmodifier;

class Account {
    public String name; //Public Access Modifier
    char Gender;   // Default Access Modifier
    protected String email; //Protected Access Modifier
    private String password; //Private Access Modifier
}
public class Access {
    //Public access modifier --> If we write public before any method or character that
    // info can be access by any class pr any package
    public static void main(String[] args) {
        /*(Default)*/ String name;
        //Default AM --> We don't need to specify default am, it already exists. If we don't put anything before any parameter,
        // any property, or function, the default am already exits.
        // It can only be access in the same package in which it is built it can't
        //be accessed outside the package
    }
    protected String email; //Protected modifier --> It can be accessed by the same package in which
    // it is built and only by other subclasses of any other package
    private String password; //Private AM --> Can be accessed in the class only

    //There private am are used by using getters and setters
}
