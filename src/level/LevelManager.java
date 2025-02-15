package level;

public class LevelManager {
    private int currentLevel;

    public LevelManager() {
        this.currentLevel = 1;
    }

    public void nextLevel() {
        currentLevel++;
        System.out.println("Advanced to Level " + currentLevel);
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}
