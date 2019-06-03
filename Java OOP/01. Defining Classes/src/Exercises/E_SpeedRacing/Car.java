package Exercises.E_SpeedRacing;

import org.omg.CORBA.INTERNAL;

public class Car {

    private final static Integer DEFAULT_TRAVELED = 0;

    private String model;
    private Double fuelAmount;
    private Double fuelCostFor1km;
    private Integer traveled;

    public Car(String model, Double fuelAmount, Double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
        this.traveled = DEFAULT_TRAVELED;
    }

    public void drive (Integer dist) {
        if (dist * this.fuelCostFor1km > this.fuelAmount) {
            throw new IllegalArgumentException("Insufficient fuel for the drive");
        }

        this.traveled += dist;
        this.fuelAmount -= dist * this.fuelCostFor1km;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.traveled);
    }
}
