package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class D_CombinationsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        System.out.println(getCombinations(n, k));
    }

    private static BigInteger getCombinations(int n, int k) {
        BigInteger divisible = getFactorial(new BigInteger(String.valueOf(n)));
        BigInteger divisor = getFactorial(new BigInteger(String.valueOf(n - k))).multiply(getFactorial(new BigInteger(String.valueOf(k))));

        return divisible.divide(divisor);
    }

    private static BigInteger getFactorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }

        return n.multiply(getFactorial(n.subtract(BigInteger.ONE)));
    }
}
