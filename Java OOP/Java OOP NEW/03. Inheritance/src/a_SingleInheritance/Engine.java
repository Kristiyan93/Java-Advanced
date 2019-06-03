package a_SingleInheritance;

import java.util.Scanner;

public class Engine implements Runnable {
    private final Scanner scanner;

    public Engine(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}
