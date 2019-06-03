package Exercises.F_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" ");

            String model = tokens[0];
            Integer enginerSpeed = Integer.parseInt(tokens[1]);
            Integer enginerPower = Integer.parseInt(tokens[2]);
            Integer cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Double tire1Pressure = Double.parseDouble(tokens[5]);
            Integer tire1Age = Integer.parseInt(tokens[6]);
            Double tire2Pressure = Double.parseDouble(tokens[7]);
            Integer tire2Age = Integer.parseInt(tokens[8]);
            Double tire3Pressure = Double.parseDouble(tokens[9]);
            Integer tire3Age = Integer.parseInt(tokens[10]);
            Double tire4Pressure = Double.parseDouble(tokens[11]);
            Integer tire4Age = Integer.parseInt(tokens[12]);

            Engine engine = new Engine(enginerSpeed, enginerPower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire1 = new Tire(tire1Pressure, tire1Age);
            Tire tire2 = new Tire(tire2Pressure, tire2Age);
            Tire tire3 = new Tire(tire3Pressure, tire3Age);
            Tire tire4 = new Tire(tire4Pressure, tire4Age);
            Tire[] tires = {
                    tire1, tire2, tire3, tire4
            };

            Car car = new Car(model, engine, cargo, tires);

            cars.add(car);

        }

        String command = reader.readLine();

        if (command.equals("fragile")) {
            cars.stream().filter(s -> s.getCargo().getType().equals(command))
                    .filter(Car::checkTyresPressure).forEach(c -> System.out.println(c.getModel()));
        } else {
            cars.stream().filter(c -> c.getCargo().getType().equals(command))
                    .filter(c -> c.getEngine().getPower() > 250).forEach( c -> System.out.println(c.getModel()));
        }
    }
}
