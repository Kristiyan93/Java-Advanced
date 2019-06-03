package Exercises.C_WildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        List<Animal> animals = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokensAnimal = input.split(" ");
            String[] tokensFood = reader.readLine().split(" ");

            Food food = null;

            switch (tokensFood[0]) {
                case "Meat":
                    food = new Meat(Integer.parseInt(tokensFood[1]));
                    break;
                case  "Vegetable":
                    food = new Vegetable(Integer.parseInt(tokensFood[1]));
                    break;
                    default:
                        break;
            }

            Integer quantity = Integer.parseInt(tokensFood[1]);
            String type = tokensAnimal[0];
            String name = tokensAnimal[1];
            Double weight = Double.parseDouble(tokensAnimal[2]);
            String live = tokensAnimal[3];

            switch (type) {
                case "Mouse":
                    Animal mouse = new Mouse(name, type, weight, 0, live);
                    mouse.makeSound();
                    mouse.eat(food);
                   // System.out.println(mouse);
                    animals.add(mouse);
                    break;
                case "Zebra":
                    Animal zebra = new Zebra(name, type, weight, 0, live);
                    zebra.makeSound();
                    zebra.eat(food);
                  //  System.out.println(zebra);
                    animals.add(zebra);
                    break;
                case "Cat":
                    Animal cat = new Cat(name, type, weight, 0, live, tokensAnimal[4]);
                    cat.makeSound();
                    cat.eat(food);
                   // System.out.println(cat);
                    animals.add(cat);
                    break;
                case "Tiger":
                    Animal tiger = new Tiger(name, type, weight, 0, live);
                    tiger.makeSound();
                    tiger.eat(food);
                  //  System.out.println(tiger);
                    animals.add(tiger);
                    break;
                    default:
                        break;
            }

            input = reader.readLine();
        }

        animals.forEach(System.out::println);
    }
}
