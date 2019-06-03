package Exercises.B_VehiclesExtension;

public class Car extends Vehicle {
    protected Car(double fuelQuantity, double fuelConsumptionInLitersPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity);
    }

    @Override
    protected void setFuelConsumptionInLitersPerKm(double fuelConsumptionInLitersPerKm) {
        double summerFuelConsumption = fuelConsumptionInLitersPerKm + 0.9;
        super.setFuelConsumptionInLitersPerKm(summerFuelConsumption);
    }
}
