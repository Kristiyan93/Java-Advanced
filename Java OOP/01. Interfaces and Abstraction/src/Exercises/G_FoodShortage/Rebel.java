package Exercises.G_FoodShortage;

public class Rebel extends Person {
    private String group;

    public Rebel(String name, Integer age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }
}
