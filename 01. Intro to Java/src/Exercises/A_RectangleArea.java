package Exercises;

import java.util.Scanner;

public class A_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a = Double.parseDouble(scanner.next());
        Double b = Double.parseDouble(scanner.next());

        scanner.nextLine();

        System.out.printf("%.2f", a * b);
    }
}
