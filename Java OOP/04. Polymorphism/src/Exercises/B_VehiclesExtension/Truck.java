package Exercises.B_VehiclesExtension;

public class Truck extends Vehicle {
    protected Truck(double fuelQuantity, double fuelConsumptionInLitersPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity);
    }

    @Override
    protected void setFuelConsumptionInLitersPerKm(double fuelConsumptionInLitersPerKm) {
        double summerFuelConsumption = fuelConsumptionInLitersPerKm + 1.6;
        super.setFuelConsumptionInLitersPerKm(summerFuelConsumption);
    }

    @Override
    public void refuel(double givenFuel) {
        double truckRefuelQuantity = givenFuel * 0.95;
        super.refuel(truckRefuelQuantity);
    }
}
