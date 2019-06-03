package a_SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person() { }

    public Person(String firstName, String lastName, Integer age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than 0.");
        }

        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", this.firstName, this.lastName, this.age);
    }
}
