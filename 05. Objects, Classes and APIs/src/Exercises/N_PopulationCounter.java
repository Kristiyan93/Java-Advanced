package Exercises;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class N_PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> map =
                new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("report")) {
            String[] tokens = input.split("\\|");

            String city = tokens[0];
            String country = tokens[1];
            int population = Integer.parseInt(tokens[2]);

            if (!map.containsKey(country)) {
                LinkedHashMap<String, Integer> townPopulation = new LinkedHashMap<>();
                townPopulation.put(city, population);
                map.put(country, townPopulation);
            } else {
                if (!map.get(country).containsKey(city)) {
                    map.get(country).put(city, population);
                } else {
                    map.get(country).put(city, map.get(country).get(city) + population);
                }
            }

            input = scanner.nextLine();
        }


        LinkedHashMap<String, Long> result = new LinkedHashMap<>();

        for (String s : map.keySet()) {
            LinkedHashMap<String, Integer> sorted = map.get(s).entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            Long totalPopulation = 0l;
            String towns = "";
            for (String s1 : sorted.keySet()) {
                int townPop = map.get(s).get(s1);
                totalPopulation += townPop;
                towns += "=>" + s1 + ": " + townPop + "\n";
            }
            towns =  s + " (total population: " + totalPopulation + ")" + "\n" + towns.substring(0,towns.length()-1);
            result.put(towns, totalPopulation);
        }

        LinkedHashMap<String, Long> sorted = result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String s : sorted.keySet()) {
            System.out.println(s);
        }
    }
}