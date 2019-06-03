package a_CardSuit;

import java.util.Scanner;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        String input = scanner.nextLine();

        if (input.equals("Card Suits")) {
            System.out.println(input + ":");

            System.out.printf("Ordinal value: %d; Name value: %s%n", 0, Suit.CLUBS);
            System.out.printf("Ordinal value: %d; Name value: %s%n", 1, Suit.DIAMONDS);
            System.out.printf("Ordinal value: %d; Name value: %s%n", 2, Suit.HEARTS);
            System.out.printf("Ordinal value: %d; Name value: %s%n", 3, Suit.SPADES);
        }
    }
}
