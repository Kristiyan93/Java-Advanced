package a_SortByNameAndAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        Integer n = Integer.parseInt(this.scanner.nextLine());

        Person person = new Person();

        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = this.scanner.nextLine().split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            Integer age = Integer.parseInt(tokens[2]);

            person = new Person(firstName, lastName, age);
            people.add(person);
        }

        people.stream()
                .sorted((a, b) -> {
                    int result = a.getFirstName().compareTo(b.getFirstName());
                    if (result == 0) {
                        return a.getAge().compareTo(b.getAge());
                    }

                    return result;
                })
                .forEach(s -> System.out.println(s.toString()));
    }
}
