package Exercises.D_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();

        String[] tokensName = reader.readLine().split(";");
        String[] tokensProduct = reader.readLine().split(";");

        for (String s : tokensName) {
            String[] tokens = s.split("=");

            try {
                Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
                personMap.putIfAbsent(tokens[0], person);
            } catch (IllegalArgumentException iea) {
                System.out.println(iea.getMessage());
                return;
            }
        }

        for (String s : tokensProduct) {
            String[] tokens = s.split("=");

            try {
                Product product = new Product(tokens[0], Integer.parseInt(tokens[1]));
                productMap.putIfAbsent(tokens[0], product);
            } catch (IllegalArgumentException iea) {
                System.out.println(iea.getMessage());
                return;
            }
        }

        String inputCommand = reader.readLine();

        while (!inputCommand.equals("END")) {
            String[] tokens = inputCommand.split(" ");

            String name = tokens[0];
            String product = tokens[1];

            if (personMap.containsKey(name) && productMap.containsKey(product)) {
                try {
                    personMap.get(name).boughtProduct(productMap.get(product));
                    System.out.printf("%s bought %s%n", name, product);
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
            }

            inputCommand =reader.readLine();
        }

        if (!personMap.isEmpty()) {
            personMap.entrySet().forEach(x -> {
                List<String> products = new ArrayList<>();
                if (x.getValue().getProducts().isEmpty()) {
                    products.add("Nothing bought");
                } else {
                    x.getValue().getProducts().forEach(s -> products.add(s.getNameProduct()));
                }

                System.out.println(x.getKey() + " - " + String.join(", ", products));
            });
        }
    }
}
