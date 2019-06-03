package Exercises.C_WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String name, String type, Double weight, Integer foodEaten, String livingRegion, String breed) {
        super(name, type, weight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##########");

        return this.getType() + "[" + this.getName() + ", " + this.breed + ", " + df.format(this.getWeight())
                + ", " + this.getLivingRegion() + ", " + this.getFoodEaten() + "]";
    }
}
