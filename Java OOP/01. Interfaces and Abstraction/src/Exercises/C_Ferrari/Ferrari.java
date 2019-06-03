package Exercises.C_Ferrari;

public class Ferrari implements Car {
    private String name;
    private String model;

    public Ferrari(String name) {
        this.setName(name);
        this.setModel(model);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setModel(String model) {
        this.model = "488-Spider";
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String pushTheGasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.model, this.brakes(), this.pushTheGasPedal(), this.name);
    }
}
