package d_FirstAndReserveTeam;

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
        Person person = new Person();
        List<Person> people = new ArrayList<>();

        Integer count = Integer.parseInt(this.scanner.nextLine());

        while (count-- > 0) {
            String[] tokens = this.scanner.nextLine().split(" ");
            try {
                person = new Person(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
                people.add(person);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        Team team = new Team("Minior");

        for (Person p : people) {
            team.addPlayer(p);
        }

        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n", team.getReserveTeam().size());
    }
}
