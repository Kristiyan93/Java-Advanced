package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < input.length / 2; i++) {
            Integer temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;
        }
        for (int i = 0; i < input.length; i++) {
            Integer i1 = input[i];

            if (i == input.length) {
                System.out.printf("%d%n", i1);
            } else {
                System.out.printf("%d ", i1);
            }
        }
    }
}
