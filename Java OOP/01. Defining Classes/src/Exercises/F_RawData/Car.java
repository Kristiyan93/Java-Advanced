package Exercises.F_RawData;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires;

    public Car(String model, Engine engine, Cargo cargo, Tire[] tires) {
        if (tires.length == 4) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tires = tires;
        } else {
            System.out.println("Incorrect number of tyres!");
        }
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public Tire[] getTires() {
        return this.tires;
    }

    public boolean checkTyresPressure() {
        for (Tire tire : tires) {
            if (tire.getPressure() < 1) {
                return true;
            }
        }

        return false;
    }
}
