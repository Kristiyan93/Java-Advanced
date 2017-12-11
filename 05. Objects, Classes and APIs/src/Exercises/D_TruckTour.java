package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class D_TruckTour {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        ArrayDeque<String> distance = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            distance.offer(reader.readLine());
        }

        Integer count = 0;

        while (true) {
            Long petrol = 0l;
            String currentCommand = distance.poll();
            String[] station = currentCommand.split(" ");
            Long currentPetrol = Long.parseLong(station[0]);
            Long kilometers = Long.parseLong(station[1]);

            petrol += currentPetrol - kilometers;

            if (petrol >= 0) {
                boolean hasSucceeded = true;

                for (String stationData : distance) {
                    String[] stationArgs = stationData.split("\\s+");
                    Long currentPetrolOfTheStation = Long.parseLong(stationArgs[0]);
                    Long currentKilometers = Long.parseLong(stationArgs[1]);

                    petrol += currentPetrolOfTheStation - currentKilometers;
                    if (petrol < 0) {
                        hasSucceeded = false;
                        break;
                    }
                }

                if (hasSucceeded) {
                    System.out.println(count);
                    return;
                } else {
                    distance.addLast(currentCommand);
                }
            } else {
                distance.offer(currentCommand);
            }

            count++;
        }
    }
}
