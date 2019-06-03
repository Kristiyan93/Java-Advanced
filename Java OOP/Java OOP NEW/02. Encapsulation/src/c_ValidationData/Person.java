package c_ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;

    public Person() { }

    public Person(String firstName, String lastName, Integer age, Double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    private void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First Name cannot be less than 3 symbols.");
        }

        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last Name cannot be less than 3 symbols.");
        }

        this.lastName = lastName;
    }

    private void setAge(Integer age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must not be zero or negative");
        }

        this.age = age;
    }

    private void setSalary(Double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public Double IncreaseSalary(Double bonus) {
        if (this.age > 30) {
            return this.salary *= 1.2;
        }

        return this.salary += this.salary * bonus / 200;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva", this.firstName, this.lastName, this.salary);
    }
}
