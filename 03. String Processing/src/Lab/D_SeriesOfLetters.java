package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_SeriesOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {
            String letter = String.valueOf(input.charAt(i));
            String nextLetter = String.valueOf(input.charAt(i + 1));

            if (!letter.equals(nextLetter)) {
                sb.append(letter);
            }
            if (i == input.length() - 2) {
                sb.append(nextLetter);
            }
        }

        System.out.println(sb.toString());
    }
}
