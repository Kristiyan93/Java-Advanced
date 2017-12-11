package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class M_HandsOfCards {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, HashSet<String>> map =
                new LinkedHashMap<>();

        String input = reader.readLine();

        while (!input.equalsIgnoreCase("joker")) {
            HashSet<String> handsOfCard = new HashSet<>();

            String[] tokens = input.split(": ");
            String name = tokens[0];
            Collections.addAll(handsOfCard, tokens[1].split(", "));

            if (!map.containsKey(name)) {
                map.put(name, handsOfCard);
            } else {
                for (String s : handsOfCard) {
                    if (!map.get(name).contains(s)) {
                        map.get(name).add(s);
                    }
                }
            }

            input = reader.readLine();
        }

        for (String s : map.keySet()) {
            int sum = 0;
            for (String card : map.get(s)) {
                sum += getCardValue(card);
            }

            System.out.printf("%s: %d%n", s, sum);
        }
    }

    private static int getCardValue(String card) {
        char value = card.charAt(0);
        char power = card.charAt(card.length() -1);

        int digitV = 0;
        int digitP = 0;

        switch (value) {
            case '2':
                digitV = 2;
                break;
            case '3':
                digitV = 3;
                break;
            case '4':
                digitV = 4;
                break;
            case '5':
                digitV = 5;
                break;
            case '6':
                digitV = 6;
                break;
            case '7':
                digitV = 7;
                break;
            case '8':
                digitV = 8;
                break;
            case '9':
                digitV = 9;
                break;
            case 'J':
                digitV = 11;
                break;
            case 'Q':
                digitV = 12;
                break;
            case 'K':
                digitV = 13;
                break;
            case 'A':
                digitV = 14;
                break;
            default:
                digitV = 10;
                break;
        }

        switch (power) {
            case 'S':
                digitP = 4;
                break;
            case 'H':
                digitP = 3;
                break;
            case 'D':
                digitP = 2;
                break;
            case 'C':
                digitP = 1;
                break;
        }

        return digitV * digitP;
    }
}
