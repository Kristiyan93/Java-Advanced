package Exercises.C_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {

    private String name;
    private Integer age;

    public Chicken(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        if (name.trim().length() == 0 || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(Integer age) {
        if (age < 1 || age >15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

        this.age = age;
    }

    public Double getProductPerDay() {
        if (this.age >=0 && this.age < 6) {
            return 2.0;
        } else if (this.age >= 6 && this.age < 12){
            return 1.0;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Chicken " + this.name + " (age " + this.age + ") can produce " + df.format(getProductPerDay()) + " eggs per day.";
    }
}
