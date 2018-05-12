public class Score {
    private int localScore;
    private int visitScore;

    public Score(int localScore, int visitScore) {
        this.localScore = localScore;
        this.visitScore = visitScore;
    }

    public int getLocalScore() {
        return localScore;
    }

    public int getVisitScore() {
        return visitScore;
    }
}
