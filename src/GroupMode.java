import java.util.ArrayList;

public class GroupMode extends GameMode {
    private ArrayList<Group> groups;
    private Fixture fixture;
    private int noGroups;

    public GroupMode(String groupName, int noGroups) {
        this.name = groupName;
        this.noGroups = noGroups;
        this.groups = new ArrayList<>();
    }

    public void generateFixture() {

    }
}
