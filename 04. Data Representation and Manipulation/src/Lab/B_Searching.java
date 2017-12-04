package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Searching {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Integer key = Integer.parseInt(reader.readLine());

        Arrays.sort(arr);

        System.out.println(binarySearch(arr, key, 0, arr.length));
    }

    private static int binarySearch(int[] arr, Integer key, Integer start, Integer end) {
        if (key > arr[arr.length - 1]) {
            return - 1;
        }
        while (end >= start) {
            Integer mid = (start + end) / 2;

            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
