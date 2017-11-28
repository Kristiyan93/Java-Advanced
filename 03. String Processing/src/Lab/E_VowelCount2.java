package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_VowelCount2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine().toLowerCase();

        Integer counter = 0;

        for (int i = 0; i < input.length(); i++) {
            Character letter = input.charAt(i);

            if (letter.equals('a') ||
                    letter.equals('e') ||
                    letter.equals('i') ||
                    letter.equals('o') ||
                    letter.equals('u') ||
                    letter.equals('y')) {
                counter++;
            }
        }

        System.out.println("Vowels: " + counter);
    }
}
