package Exercises.D_GenericSwapMethodInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            Integer input = Integer.parseInt(reader.readLine());

            list.add(input);
        }

        String[] input =reader.readLine().split("\\s+");
        Integer a = Integer.parseInt(input[0]);
        Integer b = Integer.parseInt(input[1]);

        Integer first = list.get(a);
        list.set(a, list.get(b));
        list.set(b, first);

        for (Integer s : list) {
            System.out.println(new Box<>(s));
        }
    }
}
