package c_CardsWithPower;

import java.util.Scanner;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        String inputRank = this.scanner.nextLine().toUpperCase();
        String inputSuit = this.scanner.nextLine().toUpperCase();
        int count = 0;

        count = Suit.valueOf(inputSuit).getValue() + Ranks.valueOf(inputRank).getValue();

        System.out.printf("Card name: %s of %s; Card power: %d%n",inputRank, inputSuit, count);
    }
}
