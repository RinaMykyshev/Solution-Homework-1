package score;

public class ScoreManager {
    private int score;

    public ScoreManager() {
        this.score = 0;
    }

    public void addScore(int points) {
        score += points;
        System.out.println("Score increased by " + points + ". Total Score: " + score);
    }

    public int getScore() {
        return score;
    }
}
