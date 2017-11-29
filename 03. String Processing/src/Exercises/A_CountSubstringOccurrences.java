package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine().toLowerCase();
        String regex = reader.readLine().toLowerCase();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        Integer counter = 0;

        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter);
    }
}
