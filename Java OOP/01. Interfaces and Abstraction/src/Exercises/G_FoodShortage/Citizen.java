package Exercises.G_FoodShortage;

public class Citizen extends Person {
    private String id;
    private String date;

    public Citizen(String name, Integer age, String id, String date) {
        super(name, age);
        this.id = id;
        this.date = date;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }
}
