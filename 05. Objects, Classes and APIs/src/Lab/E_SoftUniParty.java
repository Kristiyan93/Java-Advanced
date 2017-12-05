package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class E_SoftUniParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<String> party = new TreeSet<>();

        String input = reader.readLine();

        while (!input.equals("PARTY")) {
            party.add(input);

            input = reader.readLine();
        }

        input = reader.readLine();

        while (!input.equals("END")) {
            party.remove(input);

            input = reader.readLine();
        }

        System.out.println(party.size());

        for (String s : party) {
            System.out.println(s);
        }
    }
}