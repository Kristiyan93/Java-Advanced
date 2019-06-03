package Exercises.D_CompanyRoster;

public class Employee {

    private final static String DEFAULT_EMAIL = "n/a";
    private final static Integer DEFAULT_AGE = -1;

    private String name;
    private Double salary;
    private String position;
    private String department;
    private String email;
    private Integer age;

    public Employee(String name, Double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = DEFAULT_EMAIL;
        this.age = DEFAULT_AGE;
    }

    public Employee(String name, Double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = DEFAULT_AGE;
    }

    public Employee(String name, Double salary, String position, String department, Integer age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = DEFAULT_EMAIL;
    }

    public Employee(String name, Double salary, String position, String department, String email, Integer age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getAge() {
        return this.age;
    }
}
