package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_LettersChangeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        Double sum = 0.0;

        for (int i = 0; i < input.length; i++) {
            Character firstChar = input[i].charAt(0);
            Character lastChar = input[i].charAt(input[i].length() - 1);

            Double number = Double.parseDouble(input[i].substring(1, input[i].length() - 1));


            if (firstChar.toString().toUpperCase().equals(firstChar.toString())) {
                sum += number / (firstChar - 64);
            } else {
                Integer first = (int) (Character.toUpperCase(firstChar)) - 64;
                sum += number * first;
            }

            if (lastChar.toString().toUpperCase().equals(lastChar.toString())) {
                Integer last = lastChar - 64;

                sum -= last;
            } else {
                Integer last = lastChar - 96;
                sum += last;
            }
        }

        System.out.printf("%.2f%n", sum);
    }
}

