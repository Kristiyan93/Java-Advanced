package b_MultipleInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Runnable engine = new Engine(scanner);

        engine.run();
    }
}
