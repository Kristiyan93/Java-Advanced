package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class I_MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input= reader.readLine();

        Pattern regex = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");

        while (!input.equals("end")) {
            Matcher matcher = regex.matcher(input);

            if (matcher.find()) {
                System.out.println(matcher.group());
            }

            input = reader.readLine();
        }
    }
}
