package e_PizzaCalories;

public enum ToppingsModifiers {
    MEAT(1.2),
    VEGGIES(0.8),
    CHEESE(1.1),
    SAUCE(0.9);

    private final Double value;

    ToppingsModifiers(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
