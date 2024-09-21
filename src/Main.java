import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Citizen citizen1 = new Citizen("John", 23, "US");
        Citizen citizen2 = new Citizen("Senorita", 76, "Egypt");
        Citizen citizen3 = new Citizen("Diva", 65, "Korea");

       List<Citizen> citizenList = new ArrayList<>();
       citizenList.add(citizen1);
       citizenList.add(citizen2);
       citizenList.add(citizen3);
       citizenList.sort((o1, o2) -> o1.getCountry().compareTo(o2.getCountry()));
       citizenList.forEach(citizen -> System.out.println(citizen.getCountry() + " citizen name -> " + citizen.getName()));
    }
}

class Citizen {
    private String name;
    private int age;
    private String country;

    Citizen(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}