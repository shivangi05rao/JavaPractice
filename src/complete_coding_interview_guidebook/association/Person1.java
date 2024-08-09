package complete_coding_interview_guidebook.association;

public class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Address {
        private String city;
        private String zip;

        public Address(String city, String zip) {
            this.city = city;
            this.zip = zip;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1("Andrei");
        Person1 p2 = new Person1("Marin");

        Address a1 = new Address("Varanasi", "865456");
        Address a2 = new Address("Delhi", "5678904");

        //Association between classes in the main method
        System.out.println(p1.getName() + " lives at address " + a2.getCity() + ", " + a2.getZip() + " but it also has an address at "
        + a1.getCity() + ", " + a1.getZip());

        System.out.println(p2.getName() + " lives at address " + a1.getCity() + ", " + a1.getZip() + " but it also has an address at "
                + a2.getCity() + ", " + a2 .getZip());
    }
}
