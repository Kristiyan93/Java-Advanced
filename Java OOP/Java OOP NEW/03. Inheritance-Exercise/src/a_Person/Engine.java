package a_Person;

import java.util.Scanner;

public class Engine implements Runnable {
    private final Scanner scanner;

    public Engine(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {

        String name = this.scanner.nextLine();
        int age = Integer.valueOf(this.scanner.nextLine());

        try {
            Child child = new Child(name, age);

            System.out.println(child.toString());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
