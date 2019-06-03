package Exercises.A_Vehicles;

public abstract class Vehicle {
    private Double fuelQuantity;
    private Double fuelConsumptionInLitersPerKm;

    protected Vehicle(Double fuelQuantity, Double fuelConsumptionInLitersPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm);
    }

    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public Double getFuelConsumptionInLitersPerKm() {
        return fuelConsumptionInLitersPerKm;
    }

    protected void setFuelConsumptionInLitersPerKm(Double fuelConsumptionInLitersPerKm) {
        this.fuelConsumptionInLitersPerKm = fuelConsumptionInLitersPerKm;
    }

    public void drive(Double distance) {
        double fuelNeedForDistance = this.fuelConsumptionInLitersPerKm * distance;

        if (this.fuelQuantity < fuelNeedForDistance) {
            throw new IllegalStateException(String.format("%s needs refueling", this.getClass().getSimpleName()));
        }

        this.fuelQuantity -= fuelNeedForDistance;
    }

    public void refuel(Double fuel) {
        this.fuelQuantity += fuel;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
