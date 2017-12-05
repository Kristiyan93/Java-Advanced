package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;


public class F_AcademyGraduation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, double[]> map = new TreeMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            double[] scores = Arrays
                    .stream(reader.readLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            map.put(name, scores);
        }

        for (HashMap.Entry<String, double[]> entry : map.entrySet()) {
            String name = entry.getKey();

            Double sum = 0d;
            Double count = 0d;

            for (int i = 0; i < entry.getValue().length; i++) {
                sum += entry.getValue()[i];
                count++;
            }

            Double avg = sum / count;
            System.out.printf("%s is graduated with %s%n", name, avg);
        }
    }
}
