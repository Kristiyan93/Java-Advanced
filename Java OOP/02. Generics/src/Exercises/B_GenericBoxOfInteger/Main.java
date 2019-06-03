package Exercises.B_GenericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Integer integer = Integer.parseInt(reader.readLine());

            list.add(integer);
        }

        for (Integer integer : list) {
            System.out.println(new Box<>(integer));
        }
    }
}
