package Exercises.F_Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        while (!input.equals("Beast!")) {
            String[] tokens = reader.readLine().split("\\s+");

            Animal animal = null;

            try {
                animal = getAnimal(input, tokens);

                if (animal == null) {
                    System.out.println(ErrorMessageConstants.INVALID_INPUT_MESSAGE);
                } else {
                    System.out.println(animal);
                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }

            input = reader.readLine();
        }
    }

    private static Animal getAnimal(String input, String[] tokens) {
        Animal animal;
        switch (input) {
            case "Dog":
                return new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            case "Cat":
                return new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            case "Frog":
                return new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            case "Kitten":
                return new Kitten(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            case "Tomcat":
                return new Tomcat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            default:
                return null;
        }
    }
}
