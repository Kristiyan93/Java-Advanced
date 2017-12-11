package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B_MaximumElemet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            int[] elements = Arrays
                    .stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            printMaximumElement(stack, elements);
        }
    }

    private static void printMaximumElement(ArrayDeque<Integer> stack, int[] elements) {
        if (elements[0] == 1) {
            stack.push(elements[1]);
        } else if (elements[0] == 2) {
            stack.pop();
        } else if (elements[0] == 3) {
            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.addAll(stack);
            Integer maxNums = Collections.max(numbers);

            System.out.println(maxNums);
        }
    }
}