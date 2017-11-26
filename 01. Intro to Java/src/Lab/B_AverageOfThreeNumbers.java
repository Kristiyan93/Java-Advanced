package Lab;

import java.util.Scanner;

public class B_AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double num1 = Double.parseDouble(scanner.next());
        Double num2 = Double.parseDouble(scanner.next());
        Double num3 = Double.parseDouble(scanner.next());

        Double result = (num1 + num2 + num3) / 3;

        System.out.printf("%.2f%n", result);
    }
}
