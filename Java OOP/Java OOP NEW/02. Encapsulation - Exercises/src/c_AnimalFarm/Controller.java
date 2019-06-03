package c_AnimalFarm;

import java.util.Scanner;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        String name = this.scanner.nextLine();
        Integer age = Integer.parseInt(this.scanner.nextLine());

        Animal chicken;

        try {
            chicken = new Chicken(name, age);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            return;
        }

        System.out.println(chicken.getPrint());
    }
}
