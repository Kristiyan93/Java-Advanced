package Exercises.G_CarSalesman;

public class Engine {

    private String engineModel;
    private Integer enginePower;
    private String engineDisplacement;
    private String engineEfficiency;

    public Engine(String engineModel, Integer enginePower) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = "n/a";
        this.engineEfficiency = "n/a";
    }

    public Engine(String engineModel, Integer enginePower, Integer engineDisplacement) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = String.valueOf(engineDisplacement);
        this.engineEfficiency = "n/a";
    }

    public Engine(String engineModel, Integer enginePower, String engineEfficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineEfficiency = engineEfficiency;
        this.engineDisplacement = "n/a";
    }

    public Engine(String engineModel, Integer enginePower, Integer engineDisplacement, String engineEfficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = String.valueOf(engineDisplacement);
        this.engineEfficiency = engineEfficiency;
    }

    public String getEngineModel() {
        return this.engineModel;
    }

    public Integer getEnginePower() {
        return this.enginePower;
    }

    public String getEngineDisplacement() {
        return this.engineDisplacement;
    }

    public String getEngineEfficiency() {
        return this.engineEfficiency;
    }
}
