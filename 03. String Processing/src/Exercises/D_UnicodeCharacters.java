package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_UnicodeCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String input = reader.readLine();

        for (int i = 0; i < input.length(); i++) {
            sb.append(String.format ("\\u%04x", (int)input.charAt(i)));
        }

        System.out.println(sb.toString());
    }
}
