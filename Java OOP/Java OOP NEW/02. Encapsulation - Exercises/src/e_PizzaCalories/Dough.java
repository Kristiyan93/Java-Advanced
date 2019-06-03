package e_PizzaCalories;

public class Dough {
    private Double weight;
    private String flourType;
    private String bakingTechnique;

    public Dough(Double weight, String flourType, String bakingTechnique) {
        setWeight(weight);
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
    }

    public void setWeight(Double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if (!isContains(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!isContains(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingTechnique = bakingTechnique;
    }

    public Double calculateCalories() {
        Double calories = 0.0;

        Double flour = DoughModifiers.valueOf(this.flourType.toUpperCase()).getValue();
        Double baking = DoughModifiers.valueOf(this.bakingTechnique.toUpperCase()).getValue();

        calories = this.weight * flour * baking;

        return calories;
    }

    private boolean isContains(String test) {
        for (DoughModifiers c : DoughModifiers.values()) {
            if (c.name().equals(test.toUpperCase())) {
                return true;
            }
        }

        return false;
    }
}
