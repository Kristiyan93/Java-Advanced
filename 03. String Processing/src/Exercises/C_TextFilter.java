package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] pattern = reader.readLine().split(",\\s+");
        String text = reader.readLine();

        for (String s : pattern) {
            String replace = newString("*", s.length());
            text = text.replaceAll(s, replace);
        }

        System.out.println(text);
    }

    private static String newString(String s, int length) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(s);
        }

        return sb.toString();
    }
}
