package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_ParseTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        while (input.contains("<upcase>")) {
            Integer startIndex = input.indexOf("<upcase>");
            Integer endindex = input.indexOf("</upcase>");

            String upString = input.substring(startIndex + 8, endindex);
            input = input.replace(upString, upString.toUpperCase());
            input = input.replaceFirst("<upcase>", "");
            input = input.replaceFirst("</upcase>", "");
        }

        System.out.println(input);
    }
}
