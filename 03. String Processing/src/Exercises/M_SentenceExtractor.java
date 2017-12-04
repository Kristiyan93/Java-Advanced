package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M_SentenceExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> result = new ArrayList<>();
        String keyWord = reader.readLine();
        String text = reader.readLine();

        Pattern regex = Pattern.compile("\\b[A-Z][^!.?]*?\\b" + keyWord + "\\b[^!.?]*?[.!?]");
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            result.add(matcher.group());
        }

        for (String s : result) {
            System.out.println(s.trim());
        }
    }
}
