package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L_ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("[ ,:]");
        Pattern regex = Pattern.compile(
                "^[a-z]+[.-]?\\w+@\\w+[.-]?\\w+\\.\\w+\\.?\\w+");

        while (!input[0].equals("end")) {
            for (int i = 0; i < input.length; i++) {
                String s = input[i];
                Matcher matcher = regex.matcher(s);

                if (matcher.find()) {
                    System.out.println(matcher.group().toString());
                }
            }

            input = reader.readLine().split(", ");
        }
    }
}
