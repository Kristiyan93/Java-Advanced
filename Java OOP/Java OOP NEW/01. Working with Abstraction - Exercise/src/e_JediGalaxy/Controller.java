package e_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        int[] dimestions = Arrays.stream(this.scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Galaxy galaxy = new Galaxy(dimestions[0], dimestions[1]);

        StarsManipulator starsManipulator = new StarsManipulator(galaxy);

        long sum = 0;

        String command = this.scanner.nextLine();

        while (!command.equals("Let the Force be with you")) {
            int[] playerPositions = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] enemyPostions = Arrays.stream(this.scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            starsManipulator.destroyStarts(enemyPostions);

            sum += starsManipulator.sumStars(playerPositions);

            command = this.scanner.nextLine();
        }

        System.out.println(sum);
    }
}
