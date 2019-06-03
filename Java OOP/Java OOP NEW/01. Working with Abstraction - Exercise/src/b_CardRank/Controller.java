package b_CardRank;

import java.util.Scanner;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        String input = scanner.nextLine();

        if (input.equals("Card Ranks")) {
            System.out.println(input + ":");

            int count = 0;

            while (count < Ranks.values().length) {
                System.out.printf("Ordinal value: %s; Name value: %s%n",Ranks.values()[count].getValue() , Ranks.values()[count]);
                count++;
            }
        }
    }
}
