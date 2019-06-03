package c_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Runnable controller = new Controller(scanner);

        controller.run();
    }
}
