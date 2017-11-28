package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F_ExtractTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        StringBuilder sb = new StringBuilder();

        while (!input.equals("END")) {
            Pattern pattern = Pattern.compile("(<.*?>)");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                sb.append(matcher.group());
                sb.append("\n");
            }

            input = reader.readLine();
        }

        System.out.println(sb.toString());
    }
}
