package b_SalaryIncrease;

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
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    private void setSalary(Double salary) {
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
