package Exercises.E_BorderControl;

public class Citizen extends Native {
    private String name;
    private Integer age;

    public Citizen(String id, String name, Integer age) {
        super(id);
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(Integer age) {
        this.age = age;
    }
}
