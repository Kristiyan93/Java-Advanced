package Exercises.H_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        Trainer trainer = null;
        Pokemon pokemon = null;

        Map<String, Trainer> trainerMap = new HashMap<>();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split(" ");

            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            Integer pokemonHealth = Integer.parseInt(tokens[3]);

            trainer = new Trainer(trainerName);
            pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainer.addPokemon(pokemon);

            trainerMap.putIfAbsent(trainerName, trainer);
            trainerMap.get(trainerName).addPokemon(pokemon);

            input = reader.readLine();
        }

        String elementInput = reader.readLine();

        while (!elementInput.equals("End")) {
            for (String s : trainerMap.keySet()) {
                if (trainerMap.get(s).checkForElement(elementInput)){
                    trainerMap.get(s).addBadge();
                } else {
                    trainerMap.get(s).increaseHealth();
                }
            }

            elementInput = reader.readLine();
        }

        trainerMap.entrySet().stream().sorted((t1, t2) -> {
            return Integer.compare(t2.getValue().getNumberOfBadges(), t1.getValue().getNumberOfBadges());
        }).forEach(tr -> System.out.println(tr.getValue()));
    }
}
