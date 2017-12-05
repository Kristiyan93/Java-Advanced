package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class A_BasicStackOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] tokens = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
        Integer elements = tokens[0];
        Integer popElements = tokens[1];
        Integer checkElements = tokens[2];

        int[] line = new int[elements];

        line = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::valueOf)
                .toArray();

        for (int i : line) {
            stack.push(i);
        }

        for (int i = 0; i < popElements; i++) {
            stack.poll();
        }

        int minElement = Integer.MAX_VALUE;

        while (stack.size() >= 1) {
            int checkNum = stack.peek();
            if (checkElements == checkNum) {
                System.out.println("true");
                return;
            }

            if (checkNum < minElement) {
                minElement = checkNum;
            }
            stack.pop();
        }

        if (minElement == Integer.MAX_VALUE) {
            System.out.println("0");
            return;
        }

        System.out.println(minElement);
    }
}