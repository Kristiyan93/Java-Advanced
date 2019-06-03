package c_Mankind;

import java.util.Scanner;

public class Engine implements Runnable {
    private final Scanner scanner;

    public Engine(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        String[] firstInput = this.scanner.nextLine().split(" ");
        String[] secondInput = this.scanner.nextLine().split(" ");

        try {
            Student student = new Student(firstInput[0], firstInput[1], firstInput[2]);
            Worker worker = new Worker(secondInput[0]
                    , secondInput[1]
                    , Double.parseDouble(secondInput[2])
                    , Double.parseDouble(secondInput[3]));

            System.out.println(student.toString());
            System.out.println(worker.toString());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
