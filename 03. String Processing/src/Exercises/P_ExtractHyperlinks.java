package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_ExtractHyperlinks {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = readInput();
        Pattern regex = Pattern.compile(
                "<a\\s+[^>]*href\\s*=\\s*('([^']*)|\"([^\"]*)|([^\\s>]+))[^>]*");
        Matcher matcher = regex.matcher(sb);

        while (matcher.find()) {
            for (int i = 4; i >= 1; i--) {
                if (matcher.group(i) != null) {
                    System.out.println(matcher.group(i));
                    break;
                }
            }
        }
    }

    private static StringBuilder readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String input = reader.readLine();

        while (!input.equals("END")) {
            sb.append(input);

            input = reader.readLine();
        }

        return sb;
    }
}
