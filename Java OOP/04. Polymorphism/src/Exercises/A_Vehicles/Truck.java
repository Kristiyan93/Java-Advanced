package Exercises.A_Vehicles;

public class Truck extends Vehicle {
    protected Truck(Double fuelQuantity, Double fuelConsumptionInLitersPerKm) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm);
    }

    @Override
    protected void setFuelConsumptionInLitersPerKm(Double fuelConsumptionInLitersPerKm) {
        super.setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm + 1.6);
    }

    @Override
    public void refuel(Double fuel) {
        super.refuel(fuel * 0.95);
    }
}
