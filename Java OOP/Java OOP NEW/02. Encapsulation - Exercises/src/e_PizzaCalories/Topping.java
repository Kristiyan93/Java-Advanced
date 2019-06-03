package e_PizzaCalories;

public class Topping {
    private String toppingType;
    private Double weight;

    public Topping(String toppingType, Double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public void setWeight(Double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException("[Topping type name] weight should be in the range [1..50].");
        }

        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        if (!isContains(toppingType)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }

        this.toppingType = toppingType;
    }

    public Double calculateCalories() {
        return this.weight * ToppingsModifiers.valueOf(toppingType.toUpperCase()).getValue();
    }

    private boolean isContains(String test) {
        for (ToppingsModifiers c : ToppingsModifiers.values()) {
            if (c.name().equals(test.toUpperCase())) {
                return true;
            }
        }

        return false;
    }
}
