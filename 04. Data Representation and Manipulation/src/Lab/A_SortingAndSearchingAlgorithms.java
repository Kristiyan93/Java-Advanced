package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_SortingAndSearchingAlgorithms {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] elements = Arrays
                .stream(reader.readLine().split("\\s"))
                .mapToInt(Integer::valueOf)
                .toArray();

        Arrays.sort(elements);

        Integer count = 0;

        for (int element : elements) {
            count++;
            if (count == elements.length) {
                System.out.printf("%d", element);
            } else {
                System.out.printf("%d ", element);
            }
        }
    }
}
