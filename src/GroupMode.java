import java.util.ArrayList;

public class GroupMode extends GameMode {
    private ArrayList<Group> groups;
    private Fixture fixture;

    public GroupMode(String groupName) {
        this.name = groupName;
        this.groups = new ArrayList<>();
    }
}
