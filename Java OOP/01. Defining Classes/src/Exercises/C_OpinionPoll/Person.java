package Exercises.C_OpinionPoll;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }

    public String compareTo(Person p) {
        if (p.name.compareTo(this.name) == -1){
            return this.name;
        } else {
            return p.name;
        }
    }
}
