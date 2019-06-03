package Exercises.A_Vehicles;

public class Car extends Vehicle {
    protected Car(Double fuelQuantity, Double fuelConsumptionInLitersPerKm) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm);
    }

    @Override
    protected void setFuelConsumptionInLitersPerKm(Double fuelConsumptionInLitersPerKm) {
        super.setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm + 0.9);
    }
}
