package Exercises;

import java.util.Scanner;

public class D_CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a = Double.parseDouble(scanner.next());
        Double b = Double.parseDouble(scanner.next());
        Double c = Double.parseDouble(scanner.next());

        Double pow = (a + b + c) / Math.sqrt(c);
        Double f1 = ((Math.pow(a, 2) + Math.pow(b, 2))
                / (Math.pow(a, 2) - Math.pow(b, 2)));
        Double f1Result = Math.pow(f1, pow);
        Double f2 = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3));
        Double f2Result = Math.pow(f2, (a - b));
        Double f3 = Math.abs(((a + b + c) / 3)- ((f1Result + f2Result) / 2));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1Result,
                f2Result, f3);
    }
}
