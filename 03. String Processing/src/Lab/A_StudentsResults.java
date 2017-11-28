package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_StudentsResults {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" - ");
        String name = input[0];
        String[] results =input[1].split(", ");
        Double resultJAdv = Double.parseDouble(results[0]);
        Double resultJavaOOP = Double.parseDouble(results[1]);
        Double resultAdvOOP = Double.parseDouble(results[2]);

        Double resultJAverge = (resultJAdv + resultAdvOOP + resultJavaOOP) / 3.0;

        System.out.println("Name" + newString(" ", 6) + "|" + newString(" ", 3) + "JAdv|JavaOOP|" + newString(" ", 1) +
        "AdvOOP|Average|");
        System.out.println(name + newString(" ", 10 - name.length()) + "|"
                + newString(" ", 3) + String.format("%.2f", resultJAdv) + "|"
        + newString(" ", 3) + String.format("%.2f", resultJavaOOP) + "|"
        + newString(" ", 3) + String.format("%.2f", resultAdvOOP) + "|"
                + newString(" ", 1) + String.format("%.4f", resultJAverge) + "|");
    }

    private static StringBuilder newString(String s, int count) {
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < count; j++) {
            sb.append(s);
        }

        return sb;
    }
}
