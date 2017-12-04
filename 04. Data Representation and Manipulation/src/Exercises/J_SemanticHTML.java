package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J_SemanticHTML {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> lines = new ArrayList<>();
        String input = reader.readLine();

        while (!input.equals("END")) {
            lines.add(input);

            input = reader.readLine();
        }
        Pattern regex = Pattern.compile(
                "<div\\s+.*(?<forRemove>(class|id|Id)\\s*=\\s*\"(?<target>[a-z]+)\").*>");
        Pattern regex1 = Pattern.compile(
                "<\\/div>\\s+<!--\\s*(?<target>[a-z]+)\\s*-->");

        for (int i = 0; i < lines.size(); i++) {
            Matcher matcher = regex.matcher(lines.get(i));
            Matcher matcher1 = regex1.matcher(lines.get(i));

            if (matcher.find()) {
                String newLine = matcher.group().replace("<div"
                        , "<" + matcher.group("target"))
                        .replace(matcher.group("forRemove"), "")
                        .replaceAll("\\s+", " ")
                        .replace(" >", ">");
                lines.set(i, newLine);
            }
            if (matcher1.find()) {
                String newLine = matcher1.group().replace(matcher1.group()
                        , "</" + matcher1.group("target") + ">");
                lines.set(i, newLine);
            }
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
