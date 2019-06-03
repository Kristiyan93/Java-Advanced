package Exercises.E_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Identifiable identifiable = null;
        List<Identifiable> list = new ArrayList<>();

        String input = reader.readLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");

            switch (tokens.length) {
                case 2:
                    identifiable = new Robot(tokens[1], tokens[0]);
                    list.add(identifiable);
                    break;
                case 3:
                    identifiable = new Citizen(tokens[2], tokens[0], Integer.parseInt(tokens[1]));
                    list.add(identifiable);
                    break;
            }

            input = reader.readLine();
        }

        String inputLastDigits = reader.readLine();

        list.stream()
                .filter(r -> r.getId().endsWith(inputLastDigits))
                .map(Identifiable::getId)
                .forEach(System.out::println);
    }
}
