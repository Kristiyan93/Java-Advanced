package Exercises.G_FoodShortage;

public abstract class Person implements Buyer {
    private String name;
    private Integer age;
    protected Integer food;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.food = 0;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Integer getFood() {
        return this.food;
    }
}
