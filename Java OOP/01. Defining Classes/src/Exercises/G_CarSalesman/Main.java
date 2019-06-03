package Exercises.G_CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Engine> engineMap = new HashMap<>();

        Integer numberOfEngines = Integer.parseInt(reader.readLine());


        Engine engine = null;
        Car car = null;

        for (int i = 0; i < numberOfEngines; i++) {
            String[] tokens = reader.readLine().split(" ");

            String eng;
            Integer power;
            Integer displacement;
            String efficiency;
            switch (tokens.length) {
                case 4:
                    eng = tokens[0];
                    power = Integer.parseInt(tokens[1]);
                    displacement = Integer.parseInt(tokens[2]);
                    efficiency = tokens[3];

                    engine = new Engine(eng, power, displacement, efficiency);
                    engineMap.put(eng, engine);
                    break;
                case 3:
                    try {
                        eng = tokens[0];
                        power = Integer.parseInt(tokens[1]);
                        displacement = Integer.parseInt(tokens[2]);

                        engine = new Engine(eng, power, displacement);
                        engineMap.put(eng, engine);
                    } catch (Exception e) {
                        eng = tokens[0];
                        power = Integer.parseInt(tokens[1]);
                        efficiency = tokens[2];

                        engine = new Engine(eng, power, efficiency);
                        engineMap.put(eng, engine);
                    }
                    break;
                case 2:
                    eng = tokens[0];
                    power = Integer.parseInt(tokens[1]);

                    engine = new Engine(eng, power);
                    engineMap.put(eng, engine);
                    break;
            }
        }

        Integer numberOfCars = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfCars; i++) {
            String[] tokens = reader.readLine().split(" ");

            String model;
            Engine engineModel = engineMap.get(tokens[1]);
            Integer weight;
            String color;

            switch (tokens.length) {
                case 4:
                    model = tokens[0];
                    weight = Integer.parseInt(tokens[2]);
                    color = tokens[3];

                    car = new Car(model, engineModel, weight, color);
                    break;
                case 3:
                    try {
                        model = tokens[0];
                        weight = Integer.parseInt(tokens[2]);

                        car = new Car(model, engineModel, weight);
                    } catch (Exception e) {
                        model = tokens[0];
                        color = tokens[2];

                        car = new Car(model, engineModel, color);
                    }
                    break;
                case 2 :
                    model = tokens[0];

                    car = new Car(model, engineModel);
                    break;
            }

            System.out.println(car.toString());
        }
    }
}
