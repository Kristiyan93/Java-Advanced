package Exercises.C_WildFarm;

public class Tiger extends Felime {
    public Tiger(String name, String type, Double weight, Integer foodEaten, String livingRegion) {
        super(name, type, weight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            System.out.println("Tigers are not eating that type of food!");
            food.setQuantity(0);
        }

        super.setFoodEaten(food.getQuantity());
    }
}
