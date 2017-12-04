package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] elements = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Integer key = Integer.parseInt(reader.readLine());

        Arrays.sort(elements);

        System.out.println(binarySearch(elements, key, 0, elements.length));
    }

    private static int binarySearch(int[] elements, int key, int start, int end) {
        if (key > elements[elements.length - 1]) {
            return - 1;
        }

        while (end >= start) {
            int mid = (start + end) / 2;

            if (elements[mid] > key) {
                end = mid - 1;
            } else if (elements[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
