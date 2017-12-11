package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class L_AMinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Integer> miner = new LinkedHashMap<>();

        String input = reader.readLine();

        while (!input.equalsIgnoreCase("stop")) {
            Integer quantity = Integer.parseInt(reader.readLine());

            if (!miner.containsKey(input)) {
                miner.put(input, quantity);
            } else {
                miner.put(input, miner.get(input) + quantity);
            }

            input = reader.readLine();
        }

        for (HashMap.Entry<String, Integer> entry : miner.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
