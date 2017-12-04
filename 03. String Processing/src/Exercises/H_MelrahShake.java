package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_MelrahShake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder text = new StringBuilder(reader.readLine());
        StringBuilder pattern = new StringBuilder(reader.readLine());

        Boolean shakeIt = true;

        while (shakeIt) {
            Integer firstIndex = text.indexOf(pattern.toString());
            Integer lastIndex = text.lastIndexOf(pattern.toString());

            if (firstIndex + pattern.length() - 1 < lastIndex &&
                    pattern.length() > 0) {
                text = text.delete(lastIndex, lastIndex + pattern.length());
                text = text.delete(firstIndex, firstIndex + pattern.length());
                pattern = pattern.deleteCharAt(pattern.length() / 2);

                System.out.println("Shaked it.");
            } else {
                shakeIt = false;

                System.out.println("No shake.");
                System.out.println(text);
            }
        }
    }
}