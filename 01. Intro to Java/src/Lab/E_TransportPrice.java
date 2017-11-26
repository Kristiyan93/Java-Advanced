package Lab;

import java.util.Scanner;

public class E_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer kilometers = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        if (type.equals("day")) {
            if (kilometers < 20) {
                Double price = kilometers * 0.79;
                Double total = price + 0.7;
                System.out.printf("%.2f", total);
            }
            if (kilometers >= 20 && kilometers < 100) {
                Double price = kilometers * 0.09;
                System.out.printf("%.2f", price);
            }
            if (kilometers >= 100) {
                Double price = kilometers * 0.06;
                System.out.printf("%.2f", price);
            }
        }
        if (type.equals("night")) {
            if (kilometers < 20) {
                Double price = kilometers * 0.9;
                System.out.printf("%.2f", price + 0.7);
            }
            if (kilometers >= 20 && kilometers < 100) {
                Double price = kilometers * 0.09;
                System.out.printf("%.2f", price);
            }
            if (kilometers >= 100) {
                Double price = kilometers * 0.06;
                System.out.printf("%.2f", price);
            }
        }
    }
}
