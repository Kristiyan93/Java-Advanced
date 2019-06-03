package Exercises.G_FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Buyer> map = new HashMap<>();
        Buyer buyer = null;

        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" ");

            switch (tokens.length) {
                case 3:
                    buyer = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    map.putIfAbsent(tokens[0], buyer);
                    break;
                case 4:
                    buyer = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                    map.putIfAbsent(tokens[0], buyer);
                    break;
            }
        }

        String inputName = reader.readLine();

        while (!inputName.equals("End")) {
            if (map.containsKey(inputName)) {
                map.get(inputName).buyFood();
            }

            inputName = reader.readLine();
        }

        System.out.println(map.values()
                .stream()
                .mapToInt(Buyer::getFood).sum());
    }
}
