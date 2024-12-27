package objectOrientedProgramming.dataHidingEncapsulation;

public class User {
    private final String userName;
    private final String password;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password){
        if (this.userName.equalsIgnoreCase(userName) && this.password.equals(password)){
            System.out.println("Access granted against the username: " + userName + " and password: " + password);
        } else {
            System.out.println("Invalid Credentials");
        }
    }

    public static void main(String[] args) {
        User u1 = new User("Shivangi" , "qwertyu");
        u1.login("Shivangi", "qwertyu");
        u1.login("Shivangi", "dycg");
    }
}
