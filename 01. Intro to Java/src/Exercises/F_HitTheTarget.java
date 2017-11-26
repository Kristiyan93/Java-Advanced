package Exercises;

import java.util.Scanner;

public class F_HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer target = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < 21; i++) {
            for (int j = 20;j >= 1; j--) {
                if (i + j == target) {
                    System.out.printf("%d + %d = %d%n", i, j, target);
                }

                if (i - j == target) {
                    System.out.printf("%d - %d = %d%n", i, j, target);
                }
            }
        }
    }
}
