package c_HierarchicalInheritance;

import java.util.Scanner;

public class Engine implements Runnable {
    private final Scanner scanner;

    public Engine(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        Dog.eat();
        Dog.bark();

        Cat.eat();
        Cat.meow();
    }
}
