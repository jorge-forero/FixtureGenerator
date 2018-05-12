import java.util.ArrayList;

public class Tournament {
    private String name;
    private ArrayList<Stage> stages;

    public Tournament(String name) {
        this.name = name;
        this.stages = new ArrayList<>();
    }

    public void addStage(Stage stage) {
        this.stages.add(stage);
    }
}
