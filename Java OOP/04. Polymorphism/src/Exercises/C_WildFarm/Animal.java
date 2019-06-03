package Exercises.C_WildFarm;

public abstract class Animal {
    private String name;
    private String type;
    private Double weight;
    private Integer foodEaten;

    protected Animal(String name, String type, Double weight, Integer foodEaten) {
        this.setName(name);
        this.setType(type);
        this.setWeight(weight);
        this.setFoodEaten(foodEaten);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected Double getWeight() {
        return weight;
    }

    protected void setWeight(Double weight) {
        this.weight = weight;
    }

    protected Integer getFoodEaten() {
        return foodEaten;
    }

    protected void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);
}
