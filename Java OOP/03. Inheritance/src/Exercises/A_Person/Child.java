package Exercises.A_Person;

public class Child extends Person {

    public Child(String name, Integer age) {
        super(name, age);
    }

    @Override
    protected void setAge(Integer age) {
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", getName(), getAge());
    }
}
