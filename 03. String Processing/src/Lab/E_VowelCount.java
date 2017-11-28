package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E_VowelCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        int count = 0;

        Pattern regex = Pattern.compile("[aeiouyAEIOUY]");
        Matcher matcher = regex.matcher(input);

        while (matcher.find()) {
            count++;
        }

        System.out.println("Vowels: " + count);
    }
}
