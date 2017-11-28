package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_StudentsResults2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" - ");
        String name = input[0];
        String[] results =input[1].split(", ");
        Double resultJAverge = Arrays.stream(results).mapToDouble(Double::valueOf).average().getAsDouble();

        System.out.printf("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|%n", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");
        System.out.printf("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", name, Double.parseDouble(results[0]),
                Double.parseDouble(results[1]), Double.parseDouble(results[2]), resultJAverge);
    }
}
