package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C_BasicQueueOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] giveNSX = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Integer n = giveNSX[0];
        Integer s = giveNSX[1];
        Integer x = giveNSX[2];

        int[] line = new int[n];

        line = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i : line) {
            queue.offer(i);
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(queue);

        for (Integer number : numbers) {
            if (number == x) {
                System.out.println("true");
                return;
            }
        }

        if (numbers.size() == 0) {
            System.out.println(0);
            return;
        }

        Integer minNumber = Collections.min(numbers);

        System.out.println(minNumber);
    }
}
