package b_MultipleInheritance;

import java.util.Scanner;

public class Engine implements Runnable {
    private final Scanner scanner;

    public Engine(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        Puppy puppy = new Puppy();

        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
