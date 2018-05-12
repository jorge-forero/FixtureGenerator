import java.util.ArrayList;

public class Fixture {
    private ArrayList<Match> matchList;

    public Fixture() {
        this.matchList = new ArrayList<>();
    }

    public void setMatchList(ArrayList<Match> matchList) {
        this.matchList = matchList;
    }

    public void addMatch(Match match) {
        this.matchList.add(match);
    }

    public ArrayList<Match> getMatchList() {
        return matchList;
    }

    public void removeMatch(Match match) {
        this.matchList.remove(match);
    }
}
