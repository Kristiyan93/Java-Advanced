package Exercises.H_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private Integer numberOfBadges;
    private List<Pokemon> pokemonsList;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemonsList = new ArrayList<>();
    }


    public void addPokemon(Pokemon pokemon) {
        pokemonsList.add(pokemon);
    }

    public boolean checkForElement(String element) {
        for (int i = 0; i < pokemonsList.size(); i++) {
             if (this.pokemonsList.get(i).getElement().equals(element)) {
                 return true;
             }
        }

        return false;
    }

    public void addBadge() {
        this.numberOfBadges++;
    }

    public void increaseHealth() {
        List<Integer> pokemontForRemove = new ArrayList<>();

        for (int i = 0; i < pokemonsList.size(); i++) {
            if (this.pokemonsList.get(i).getHealth() - 10 <= 0) {
                pokemontForRemove.add(i);
            } else {
                this.pokemonsList.get(i).increaseHealth();
            }
        }

        this.removePokemons(pokemontForRemove);
    }

    private void removePokemons (List<Integer> pokemonIndexes) {
        for (int i = pokemonIndexes.size()-1; i >= 0; i--) {
            pokemonsList.remove((int)pokemonIndexes.get(i));
        }
    }

    public int getNumberOfBadges() {
        return this.numberOfBadges;
    }

    @Override
    public String toString() {
        return this.name + " " + this.numberOfBadges + " " + this.pokemonsList.size();
    }
}
