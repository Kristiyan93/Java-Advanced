package e_PizzaCalories;

public interface PizzaCalories {

    void addDough(Dough dough);

    void addTopping(Topping topping);

    String namePizza();

    Double getOverallCalories();

}
