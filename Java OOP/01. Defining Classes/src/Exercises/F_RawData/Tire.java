package Exercises.F_RawData;

public class Tire {

    private Double pressure;
    private Integer age;

    public Tire(Double pressure, Integer age) {
        this.pressure = pressure;
        this.age = age;
    }

    public Double getPressure() {
        return this.pressure;
    }

    public Integer getAge() {
        return this.age;
    }
}
