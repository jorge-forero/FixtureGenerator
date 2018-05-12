public abstract class GameMode {
    protected String name;

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        this.name = name;
    }
}
