package Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class K_GameofNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> playersData = new LinkedHashMap<>();

        Integer n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String playerName = scanner.nextLine();
            Integer initialScore = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < playerName.length(); j++) {
                if (playerName.charAt(j) % 2 == 0) {
                    initialScore += playerName.charAt(j);
                } else {
                    initialScore -= playerName.charAt(j);
                }
            }

            playersData.put(playerName, initialScore);
        }

        Integer max = Integer.MIN_VALUE;
        String result = "";

        for (HashMap.Entry<String, Integer> kvp : playersData.entrySet()) {
            if (kvp.getValue() > max) {
                max = kvp.getValue();
                result = String.format("The winner is %s - %d points", kvp.getKey(), kvp.getValue());
            }
        }

        System.out.println(result);
    }
}