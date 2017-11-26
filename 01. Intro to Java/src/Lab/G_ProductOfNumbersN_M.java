package Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class G_ProductOfNumbersN_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.next());
        Integer m = Integer.parseInt(scanner.next());
        BigInteger result = BigInteger.ONE;

        for (int i = n; i <= m; i++) {
            BigInteger numberBig = new BigInteger("" + i);
            result = result.multiply(numberBig);
        }

        System.out.printf("product[%d..%d] = %d", n, m, result);
    }
}
