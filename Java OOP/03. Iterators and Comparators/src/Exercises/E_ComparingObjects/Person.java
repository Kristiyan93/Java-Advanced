package Exercises.E_ComparingObjects;

public class Person implements Comparable<Person>  {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return this.town;
    }

    private void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) != 0) {
            return this.name.compareTo(person.name);
        } else if (Integer.compare(this.age, person.age) != 0) {
            return Integer.compare(this.age, person.age);
        } else {
            return this.town.compareTo(person.town);
        }
    }
}
