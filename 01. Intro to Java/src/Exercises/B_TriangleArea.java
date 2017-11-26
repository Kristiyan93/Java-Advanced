package Exercises;

import java.util.Scanner;

public class B_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double x1 = Double.parseDouble(scanner.next());
        Double y1 = Double.parseDouble(scanner.next());
        Double x2 = Double.parseDouble(scanner.next());
        Double y2 = Double.parseDouble(scanner.next());
        Double x3 = Double.parseDouble(scanner.next());
        Double y3 = Double.parseDouble(scanner.next());

        Double result = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        Integer area = (int)Math.abs(result / 2.0);

        System.out.printf("%d", area);
    }
}
