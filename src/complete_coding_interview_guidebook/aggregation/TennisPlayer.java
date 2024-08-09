package complete_coding_interview_guidebook.aggregation;

public class TennisPlayer {
    private String name;
    private Racket racket;

    public TennisPlayer(String name, Racket racket) {
        this.name = name;
        this.racket = racket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Racket getRacket() {
        return racket;
    }

    public void setRacket(Racket racket) {
        this.racket = racket;
    }

    public static void main(String[] args) {
        Racket racket = new Racket("Abort Pure Aero", 100, 300);
        TennisPlayer tennisPlayer = new TennisPlayer("Rafael Nadal", racket);

        System.out.println("Player " + tennisPlayer.getName() + " plays with " + tennisPlayer.getRacket().getType());
    }
}
