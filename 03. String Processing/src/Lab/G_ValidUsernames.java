package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class G_ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        StringBuilder sb = new StringBuilder();
        Integer count = 0;
        String regex = "[\\w-]{3,16}$";

        while (!input.equals("END")) {
            if (Pattern.matches(regex, input)) {
                sb.append("valid");
                sb.append("\n");
                count++;
            } else {
                sb.append("invalid");
                sb.append("\n");
            }

            input = reader.readLine();
        }

        if (count > 0) {
            System.out.println(sb.toString());
        }
    }
}
