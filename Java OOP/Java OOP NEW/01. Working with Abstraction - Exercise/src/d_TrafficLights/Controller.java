package d_TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        List<String> input = Arrays
                .stream(this.scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        List<Traffic> lights = new ArrayList<>();

        for (String s : input) {
            if (s.equals("GREEN") || s.equals("RED") || s.equals("YELLOW")) {
                Traffic traffic = new TrafficLights(EnumLights.valueOf(s));

                lights.add(traffic);
            }
        }

        Integer n = Integer.parseInt(this.scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            for (Traffic light : lights) {
                light.update();
                sb.append(light.toString()).append(" ");
            }

            sb.append(System.lineSeparator());
        }

        System.out.println(sb.toString().trim());
    }
}
