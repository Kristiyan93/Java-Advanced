package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeMap;

public class J_CountSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        TreeMap<Character, Integer> maps = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character symbol = input.charAt(i);

            if (!maps.containsKey(symbol)) {
                maps.put(symbol, 1);
            } else {
                maps.put(symbol, maps.get(symbol) + 1);
            }
        }

        for (HashMap.Entry<Character, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() +
                    " time/s");
        }
    }
}
