package Exercises.A_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Vehicle> map = new HashMap<>();

        String[] tokensCar = reader.readLine().split(" ");
        String[] tokensTruck = reader.readLine().split(" ");

        Vehicle car = new Car(Double.parseDouble(tokensCar[1]), Double.parseDouble(tokensCar[2]));
        Vehicle truck = new Truck(Double.parseDouble(tokensTruck[1]), Double.parseDouble(tokensTruck[2]));

        map.putIfAbsent("Car", car);
        map.putIfAbsent("Truck", truck);
        
        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" ");

            String command = tokens[0];
            String type = tokens[1];
            Double fuelOrDistance = Double.parseDouble(tokens[2]);

            try {
                switch (command) {
                    case "Drive":
                        map.get(type).drive(fuelOrDistance);
                        String pattern = "#.##";
                        DecimalFormat decimalFormat = new DecimalFormat(pattern);
                        System.out.println(String.format("%s travelled %s km", type, decimalFormat.format(fuelOrDistance)));
                        break;
                    case "Refuel":
                        map.get(type).refuel(fuelOrDistance);
                        break;
                }
            } catch (IllegalStateException ise) {
                System.out.println(ise.getMessage());
            }
        }

        System.out.println(car);
        System.out.println(truck);
    }
}
