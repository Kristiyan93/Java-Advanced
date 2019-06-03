package Exercises.F_RawData;

public class Cargo {

    private Integer weight;
    private String type;

    public Cargo(Integer weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public String getType() {
        return this.type;
    }
}
