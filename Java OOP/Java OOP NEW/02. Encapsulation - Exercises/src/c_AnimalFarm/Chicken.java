package c_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken implements Animal {
    private String name;
    private Integer age;

    public Chicken(String name, Integer age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.trim().length() == 0 || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    private void setAge(Integer age) {
        if (age < 1 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

        this.age = age;
    }

    private Double productPerDay() {
        if (this.age > 11) {
            return 0.75;
        }

        if (this.age > 5) {
            return 1.0;
        }

        return 2.0;
    }

    private Double calculateProductPerDay() {
        return this.productPerDay();
    }

    @Override
    public String getPrint() {
        DecimalFormat df = new DecimalFormat("#.##");

        return "Chicken " + this.name
                + " (age " + this.age + ") can produce "
                + df.format(this.calculateProductPerDay())
                + " eggs per day.";
    }
}
