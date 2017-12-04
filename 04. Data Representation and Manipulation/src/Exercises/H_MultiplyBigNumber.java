package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class H_MultiplyBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n1 = reader.readLine();
        String n2 = reader.readLine();

        BigInteger result = new BigInteger(n1).multiply(new BigInteger(n2));

        System.out.println(result);
    }
}
