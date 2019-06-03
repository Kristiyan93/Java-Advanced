package e_PizzaCalories;

public enum DoughModifiers {
    WHITE(1.5),
    WHOLEGRAIN(1.0),
    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    private final Double value;

    DoughModifiers(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
