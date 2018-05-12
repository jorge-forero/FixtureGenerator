public class Match {
    private Team localTeam;
    private Team visitTeam;
    private Score score;

    public Match(Team localTeam, Team visitTeam) {
        this.localTeam = localTeam;
        this.visitTeam = visitTeam;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Score getScore() {
        return score;
    }

    public Team getLocalTeam() {
        return localTeam;
    }

    public Team getVisitTeam() {
        return visitTeam;
    }
}
