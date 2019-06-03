package Exercises.E_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> list = new ArrayList<>();

        String input = reader.readLine();

        while (!input.equals("END")) {
            String[] tokens = input.split(" ");

            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            list.add(person);

            input = reader.readLine();
        }

        Integer inputN = Integer.parseInt(reader.readLine());
        Integer count = 0;

        if (inputN >= 0 && list.size() > inputN) {
            Person per = list.get(inputN);

            for (Person person : list) {
                if (per.compareTo(person) == 0) {
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", count, list.size() - count, list.size());
        }
    }
}
