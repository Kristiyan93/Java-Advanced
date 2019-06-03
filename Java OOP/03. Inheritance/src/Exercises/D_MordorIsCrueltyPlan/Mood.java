package Exercises.D_MordorIsCrueltyPlan;

public class Mood extends Food {

    private String mood;

    public String getMode() {
        return this.mood;
    }

    public void setMode() {
        if (this.getPoints() < -5) {
            this.mood = "Angry";
        } else if (this.getPoints() < 0) {
            this.mood = "Sad";
        } else if (this.getPoints() <= 15) {
            this.mood = "Happy";
        } else {
            this.mood = "JavaScript";
        }
    }
}