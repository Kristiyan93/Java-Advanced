package Exercises.C_WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String name, String type, Double weight, Integer foodEaten, String livingRegion) {
        super(name, type, weight, foodEaten);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##########");

        return this.getType() + "[" + this.getName() + ", " + df.format(this.getWeight())
                + ", " + this.livingRegion + ", " + this.getFoodEaten() + "]";
    }
}
