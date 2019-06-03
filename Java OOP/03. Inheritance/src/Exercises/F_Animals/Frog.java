package Exercises.F_Animals;

public class Frog extends Animal {

    private static final String SOUND = "Frogggg";

    public Frog(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return SOUND;
    }
}
