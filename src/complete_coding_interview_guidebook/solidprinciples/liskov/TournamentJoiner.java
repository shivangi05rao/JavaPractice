package complete_coding_interview_guidebook.solidprinciples.liskov;

import java.util.List;

public interface TournamentJoiner {
    public void joinTournament();
}

interface TournamentOrganizer {
    public void organizerTournament();
}

abstract class Member implements TournamentJoiner, TournamentOrganizer{
    private final String name;

    public Member(String name) {
        this.name = name;
    }
}

class FreeMember implements TournamentJoiner {

    private final String name;

    public FreeMember(String name) {
        this.name = name;
    }

    @Override
    public void joinTournament() {
        System.out.println("Free member jons tournament...");
    }
}

