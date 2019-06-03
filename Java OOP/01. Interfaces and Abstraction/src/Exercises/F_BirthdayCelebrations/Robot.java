package Exercises.F_BirthdayCelebrations;

public abstract class Robot extends Native {
    private String model;

    public Robot(String id, String model) {
        super(id);
        this.model = model;
    }
}
