package e_PizzaCalories;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        String input = this.scanner.nextLine();

        PizzaCalories pizza = new Pizza();
        Dough dough;
        Topping topping;

        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            switch (tokens[0]) {
                case "Pizza":
                    try {
                        pizza = new Pizza(tokens[1], Integer.parseInt(tokens[2]));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                        return;
                    }

                    break;
                case "Dough":
                    try {
                        dough = new Dough(Double.parseDouble(tokens[3]), tokens[1], tokens[2]);

                        pizza.addDough(dough);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                        return;
                    }

                    break;
                case "Topping":
                    try {
                        topping = (new Topping(tokens[1], Double.parseDouble(tokens[2])));

                        pizza.addTopping(topping);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                        return;
                    }

                    break;
                    default:
                        break;
            }

            input = this.scanner.nextLine();
        }

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(pizza.namePizza() + " - " + df.format(pizza.getOverallCalories()));
    }
}
