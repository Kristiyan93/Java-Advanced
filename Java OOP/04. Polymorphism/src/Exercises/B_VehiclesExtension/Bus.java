package Exercises.B_VehiclesExtension;

public class Bus extends Vehicle {
    public Bus(double fuelQuantity, double fuelConsumptionInLitersPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity);
    }

    @Override
    protected void setFuelConsumptionInLitersPerKm(double fuelConsumptionInLitersPerKm) {
        double summerFuelConsumption = fuelConsumptionInLitersPerKm + 1.4;
        super.setFuelConsumptionInLitersPerKm(summerFuelConsumption);
    }
}
