import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> playerList;
    private boolean disqualified;

    public Team(String name) {
        this.name = name;
        this.playerList = new ArrayList<>();
    }

    public void changeTeamName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.playerList.add(player);
    }

    public void disqualifiedTeam() {
        this.disqualified = true;
    }

    public boolean isDisqualified() {
        return disqualified;
    }
}
