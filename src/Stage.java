public class Stage {
    private GameMode gameMode;

    public Stage(String gameMode, String stageName) {
        switch (gameMode) {
            case "GroupMode": this.gameMode = new GroupMode(stageName);
        }
    }

}
