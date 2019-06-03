package Exercises.F_BirthdayCelebrations;

public class Pet implements Birthdayable {
    private String name;
    private String birthday;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String getDate() {
        return this.birthday;
    }
}
