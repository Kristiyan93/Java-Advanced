package Exercises;

import java.util.Scanner;

public class C_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.next());
        Double b = Double.parseDouble(scanner.next());
        Double c = Double.parseDouble(scanner.next());

        String hex = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);
        Integer binaryInt = Integer.parseInt(binary);

        System.out.print("|" + hex + repeatStr(" ", 10 - hex.length()) + "|" );
        System.out.printf("%010d|", binaryInt);
        System.out.printf("%10.2f|%-10.3f|%n", b, c);
    }
    public static String repeatStr (String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
