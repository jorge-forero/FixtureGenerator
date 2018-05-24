import java.util.HashMap;
import java.util.Map;

public class Match {
    private Map<Team, Integer> teams;

    public Match(Team localTeam, Team visitTeam) {
        this.teams = new HashMap<>();
        teams.put(localTeam, 0);
        teams.put(visitTeam, 0);
    }

    public void increaseScore(Team team, int score) {
        this.teams.put(team, this.teams.get(team) + score);
    }

    public void decreaseScore(Team team, int score) {
        this.teams.put(team, this.teams.get(team) - score);
    }


    public int getTeamScore(Team team) {
        return this.teams.get(team);
    }

    public Map<Team, Integer> getResults() {
        return this.teams;
    }
}
