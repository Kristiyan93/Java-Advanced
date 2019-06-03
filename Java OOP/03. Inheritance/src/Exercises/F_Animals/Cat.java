package Exercises.F_Animals;

public class Cat extends Animal {

    private static final String SOUND = "MiauMiau";

    public Cat(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return SOUND;
    }
}
