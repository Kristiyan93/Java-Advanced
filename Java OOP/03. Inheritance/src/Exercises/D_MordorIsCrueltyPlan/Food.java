package Exercises.D_MordorIsCrueltyPlan;

public class Food {

    private int points;

    public int getPoints() {
        return this.points;
    }

    public void eatFood(String food) {
        switch (food) {
            case "cram":
                this.points += 2;
                break;
            case "lembas":
                this.points += 3;
                break;
            case "apple":
                this.points += 1;
                break;
            case "melon":
                this.points += 1;
                break;
            case "honeycake":
                this.points += 5;
                break;
            case "mushrooms":
                this.points -= 10;
                break;
            default:
                this.points -= 1;
                break;
        }
    }
}