package Exercises.F_Animals;

public class Dog extends Animal {

    private static final String SOUND = "BauBau";

    public Dog(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return SOUND;
    }
}
