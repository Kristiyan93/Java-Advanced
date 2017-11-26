package Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class C_EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double quantity = Double.parseDouble(scanner.nextLine());

        Double priceForKg = 1.2;
        BigDecimal priceBg = new BigDecimal(priceForKg * quantity);

        BigDecimal exchange = new BigDecimal("4210500000000");
        BigDecimal marks = exchange.multiply(priceBg);

        System.out.printf("%.2f marks", marks);
    }
}
