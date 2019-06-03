package Exercises.F_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Birthdayable> list = new ArrayList<>();
        Birthdayable birthdayable = null;

        String input = reader.readLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");

            String type = tokens[0];

            switch (type) {
                case "Citizen":
                    birthdayable = new Citizen(tokens[3], tokens[3], Integer.parseInt(tokens[2]), tokens[4]);
                    list.add(birthdayable);
                    break;
                case "Robot":
                    break;
                case "Pet":
                    birthdayable = new Pet(tokens[1], tokens[2]);
                    list.add(birthdayable);
                    break;
            }

            input = reader.readLine();
        }

        String inputDate = reader.readLine();

        list.stream()
                .filter(r -> r.getDate().endsWith(inputDate))
                .map(Birthdayable::getDate)
                .forEach(System.out::println);
    }
}
