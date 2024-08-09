package complete_coding_interview_guidebook.inheritance;

public class Programmer extends Employee {
    private String team;
    public Programmer(String name, String team) {
        super(name);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public static void main(String[] args) {
        Programmer p1 = new Programmer("Shivangi", "Toronto");

        String name = p1.getName();
        String team = p1.getTeam();
        System.out.println(name + " is assigned to the " + team + " team");
    }
}
