package a_RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        Drawable rhombus = new Rhombus(n);

        rhombus.draw();
    }
}
