package Exercises.E_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" ");

            Car car = new Car(tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));

            cars.putIfAbsent(tokens[0], car);
        }

        String input = reader.readLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");

            try {
                cars.get(tokens[1]).drive(Integer.parseInt(tokens[2]));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }

            input = reader.readLine();
        }

        cars
                .values()
                .forEach(System.out::println);
    }
}
