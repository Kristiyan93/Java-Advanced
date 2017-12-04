package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J_MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        Pattern pattern = Pattern.compile("^(\\+359)([ -])2\\2\\d{3}\\2\\d{4}\\b");

        while (!input.equals("end")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                System.out.println(matcher.group());
            }

            input = reader.readLine();
        }
    }
}
