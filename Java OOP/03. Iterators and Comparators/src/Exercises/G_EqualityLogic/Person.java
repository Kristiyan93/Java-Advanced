package Exercises.G_EqualityLogic;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0) {
           return Integer.compare(this.age, o.age);
        }

        return this.name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.age;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;

        return person.name.equals(this.name) && person.age == this.age;
    }
}
