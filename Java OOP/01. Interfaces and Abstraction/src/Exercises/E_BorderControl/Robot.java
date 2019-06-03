package Exercises.E_BorderControl;

public class Robot extends Native {
    private String model;

    public Robot(String id, String model) {
        super(id);
        this.setModel(model);
    }

    private void setModel(String model) {
        this.model = model;
    }
}
