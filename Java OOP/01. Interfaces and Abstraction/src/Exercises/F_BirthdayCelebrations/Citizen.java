package Exercises.F_BirthdayCelebrations;

public class Citizen extends Native {
    private String name;
    private Integer age;
    private String birthday;

    public Citizen(String id, String name, Integer age, String birthday) {
        super(id);
        this.setName(name);
        this.setAge(age);
        this.setBirthday(birthday);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String getDate() {
        return this.birthday;
    }
}
