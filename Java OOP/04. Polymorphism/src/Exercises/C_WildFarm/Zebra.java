package Exercises.C_WildFarm;

public class Zebra extends Mammal {
    public Zebra(String name, String type, Double weight, Integer foodEaten, String livingRegion) {
        super(name, type, weight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            System.out.println("Zebras are not eating that type of food!");
            food.setQuantity(0);
        }

        super.setFoodEaten(food.getQuantity());
    }
}
