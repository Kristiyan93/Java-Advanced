package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N_SumOfAllValues {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String keyString = reader.readLine();
        String textString = reader.readLine();

        Pattern regex = Pattern.compile("^[a-zA-Z_]+(?=\\d)");
        Pattern patternEnd = Pattern.compile("(?<=\\d)[a-zA-Z_]+$");

        Matcher matcherStart = regex.matcher(keyString);
        Matcher matcherEnd = patternEnd.matcher(keyString);

        String startKey;
        String endKey;

        if (matcherStart.find() && matcherEnd.find()) {
            startKey = matcherStart.group();
            endKey = matcherEnd.group();

            Pattern digits = Pattern.compile(startKey + "[\\d.]+?" + endKey);
            Matcher matchDigits = digits.matcher(textString);
            double sum = 0;

            while (matchDigits.find()) {
                double num = Double.parseDouble(matchDigits.group()
                        .substring(startKey.length(), matchDigits.group().length() - endKey.length()));
                sum += num;
            }

            if (sum > 0) {
                if (sum % 1 == 0) {
                    System.out.printf("<p>The total value is: <em>%d</em></p>", (int)sum);
                } else {
                    System.out.printf("<p>The total value is: <em>%.2f</em></p>", sum);
                }
            } else {
                System.out.println("<p>The total value is: <em>nothing</em></p>");
            }
        } else {
            System.out.println("<p>A key is missing</p>");
        }
    }
}
