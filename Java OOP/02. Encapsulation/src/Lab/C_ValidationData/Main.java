package Lab.C_ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> personList = new ArrayList<>();

        Integer n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" ");

            try {
                Person person = new Person(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
                personList.add(person);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        Integer bonus = Integer.parseInt(reader.readLine());

        for (Person person : personList) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
