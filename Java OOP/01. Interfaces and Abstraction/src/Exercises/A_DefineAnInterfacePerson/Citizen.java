package Exercises.A_DefineAnInterfacePerson;

public class Citizen implements Person {
    private String name;
    private Integer age;

    public Citizen(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}
