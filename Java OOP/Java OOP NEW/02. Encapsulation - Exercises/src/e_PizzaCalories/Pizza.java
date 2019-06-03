package e_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements PizzaCalories {
    private String name;
    private Integer numberOfToppings;
    private Dough dought;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza() { }

    public Pizza(String name, Integer numberOfToppings) {
        setName(name);
        setNumberOfToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (name.isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    private void setNumberOfToppings(Integer numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

        this.numberOfToppings = numberOfToppings;
    }

    @Override
    public void addDough(Dough dough) {
        if (this.dought == null) {
            this.dought = dough;
        }
    }

    @Override
    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    @Override
    public String namePizza() {
        return this.name;
    }

    @Override
    public Double getOverallCalories() {
        Double dough = this.dought.calculateCalories();
        Double topping = this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();

        return this.numberOfToppings * (dough + topping);
    }
}
