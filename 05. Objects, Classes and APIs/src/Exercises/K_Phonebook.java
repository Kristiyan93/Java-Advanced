package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class K_Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("-");

        LinkedHashMap<String, String> phones = new LinkedHashMap<>();

        while (!input[0].equals("search")) {
            phones.put(input[0], input[1]);

            input = reader.readLine().split("-");
        }

        String name = reader.readLine();

        while (!name.equalsIgnoreCase("Stop")) {
            if (phones.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phones.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }

            name = reader.readLine();
        }
    }
}
