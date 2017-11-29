package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_SumBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger firstDigit = new BigInteger(reader.readLine());
        BigInteger secondDigit = new BigInteger(reader.readLine());

        System.out.println(firstDigit = firstDigit.add(secondDigit));
    }
}
