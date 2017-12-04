package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_SortingAndSearchingAlgorithms_SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] elements = Arrays
                .stream(reader.readLine().split("\\s"))
                .mapToInt(Integer::valueOf)
                .toArray();

        for (int i = 0; i < elements.length - 1; i++) {
            Integer min = i;

            for (int j = i; j < elements.length; j++) {
                if (elements[j] < elements[i]) {
                    min = j;
                    swap(elements, min, i);
                }
            }
        }

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

    private static void swap(int[] elements, int min, int i) {
        Integer temp = elements[min];
        elements[min] = elements[i];
        elements[i] = temp;
    }
}
