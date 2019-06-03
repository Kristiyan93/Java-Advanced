package Exercises.C_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.valueOf(reader.readLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.valueOf(input[1]);
            Person person = new Person(name, age);
            persons.add(person);
        }

        persons.stream().filter(p -> p.getAge() > 30).sorted(Comparator.comparing(a -> a.getName())).forEach(System.out::println);
    }
}
