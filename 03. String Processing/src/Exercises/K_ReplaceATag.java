package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class K_ReplaceATag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String input = reader.readLine();

        while (!input.equals("END")) {
            sb.append(input.toString());
            sb.append("\n");
            input = reader.readLine();
        }

        Pattern regex = Pattern.compile("(<a\\s+href\\s*=\\s*)(.+?)(>)(\\n?.+?)(<\\/a>)", Pattern.DOTALL);
        Matcher matcher = regex.matcher(sb);

        while (matcher.find()) {
            String replacement = "[URL href=" + matcher.group(2) + "]" + matcher.group(4) + "[/URL]";
            sb.replace(matcher.start(), matcher.end(), replacement);
            matcher = regex.matcher(sb);
        }

        System.out.println(sb);
    }
}
