package Exercises.G_CarSalesman;

public class Car {

    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    public Car(String model, Engine engine, Integer weight) {
        this.model = model;
        this.engine = engine;
        this.weight = String.valueOf(weight);
        this.color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.weight = "n/a";
    }

    public Car(String model, Engine engine, Integer weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = String.valueOf(weight);
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.model).append(":\n");
        sb.append("  " + this.engine.getEngineModel()).append(":\n");
        sb.append("    Power: " + this.engine.getEnginePower()).append("\n");
        sb.append("    Displacement: " + this.engine.getEngineDisplacement()).append("\n");
        sb.append("    Efficiency: " + this.engine.getEngineEfficiency()).append("\n");
        sb.append("  Weight: " + this.weight).append("\n");
        sb.append("  Color: " + this.color);

        return sb.toString();
    }
}
