package c_ValidationData;

import java.util.ArrayList;
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

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String[] tokens = this.scanner.nextLine().split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            Integer age = Integer.parseInt(tokens[2]);
            Double salary = Double.parseDouble(tokens[3]);

            try {
                person = new Person(firstName, lastName, age, salary);
                people.add(person);
            } catch (IllegalArgumentException iae) {
                sb.append(iae.getMessage()).append(System.lineSeparator());
            }
        }

        Double bonus = Double.parseDouble(this.scanner.nextLine());

        for (Person p : people) {
            p.IncreaseSalary(bonus);
            sb.append(p.toString()).append(System.lineSeparator());
        }

        System.out.println(sb.toString());
    }
}
