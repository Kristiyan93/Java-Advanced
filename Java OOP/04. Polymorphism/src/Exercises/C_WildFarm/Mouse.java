package Exercises.C_WildFarm;

public class Mouse extends Mammal {
    public Mouse(String name, String type, Double weight, Integer foodEaten, String livingRegion) {
        super(name, type, weight, foodEaten, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            System.out.println("Mouses are not eating that type of food!");
            food.setQuantity(0);
        }

        super.setFoodEaten(food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
