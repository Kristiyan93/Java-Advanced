package Lab;

import java.util.Scanner;

public class A_CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double base = Double.parseDouble(scanner.next());
        Double height = Double.parseDouble(scanner.next());

        scanner.nextLine();

        Double result = calculateTriamgle(base, height);

        System.out.printf("Area = %.2f", result);
    }

    private static double calculateTriamgle(double base, double height) {
        return (base * height) / 2;
    }
}