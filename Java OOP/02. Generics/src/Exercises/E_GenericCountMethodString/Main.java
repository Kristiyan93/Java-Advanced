package Exercises.E_GenericCountMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();

            list.add(input);
        }

        String target = reader.readLine();
        System.out.println(returnCount(list, target));
    }

    private static <T extends Comparable<T>> Integer returnCount(List<T> list, T element) {
        int count = 0;

        for (T listElement : list) {
            if (listElement.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }
}
