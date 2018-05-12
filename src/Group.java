import java.util.ArrayList;

public class Group {
    private String groupName;
    private ArrayList<Team> teams;

    public Group(String groupName) {
        this.groupName = groupName;
        this.teams = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }
}
