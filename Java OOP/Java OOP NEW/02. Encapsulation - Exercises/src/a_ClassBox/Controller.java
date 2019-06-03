package a_ClassBox;

import java.util.Scanner;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        double length = Double.parseDouble(this.scanner.nextLine());
        double width = Double.parseDouble(this.scanner.nextLine());
        double height = Double.parseDouble(this.scanner.nextLine());

        Box box = new Box(length, width, height);

        System.out.println(box.toString());

        /*System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralSurfaceArea());
        System.out.printf("Volume – %.2f%n", box.calculateVolume());*/
    }
}
