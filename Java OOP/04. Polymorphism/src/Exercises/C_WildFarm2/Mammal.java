package Exercises.C_WildFarm2;

import static Exercises.C_WildFarm2.Main.DECIMAL_FORMAT;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]", this.getClass().getSimpleName(), super.getAnimalName(), DECIMAL_FORMAT.format(super.getAnimalWeight()), this.livingRegion, super.getFoodEaten());
    }
}
