package Exercises.H_PokemonTrainer;

public class Pokemon {

    private String name;
    private String element;
    private Integer health;

    public Pokemon(String name, String element, Integer health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return this.element;
    }

    public Integer getHealth() {
        return this.health;
    }

    public void increaseHealth() {
        this.health -= 10;
    }
}
