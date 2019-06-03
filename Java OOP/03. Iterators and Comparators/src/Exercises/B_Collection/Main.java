package Exercises.B_Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        ListyIterator iterator = null;

        while (!input.equals("END")) {
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Create":
                    iterator = new ListyIterator(Arrays.stream(tokens).skip(1).toArray(String[]::new));
                    break;
                case "Move":
                    System.out.println(iterator.move());
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "Print":
                    try {
                        iterator.print();
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "PrintAll":
                    try {
                        iterator.printAll();
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
            }

            input = reader.readLine();
        }
    }
}
