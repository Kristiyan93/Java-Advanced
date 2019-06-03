package d_ShoppingSpree;

import java.util.*;

public class Controller implements Runnable {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        String[] tokensPeople = this.scanner.nextLine().split(";");
        String[] tokensProduct = this.scanner.nextLine().split(";");

        Map<String, Person> peopleMap = new HashMap<>();
        Map<String, Product> productsMap = new HashMap<>();

        Person person;
        Product product;

        for (String p : tokensPeople) {
            String[] tokens = p.split("=");
            String name = tokens[0];
            Double money = Double.parseDouble(tokens[1]);

            try {
                peopleMap.putIfAbsent(tokens[0], new Person(name, money));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }

        for (String p : tokensProduct) {
            String[] tokens = p.split("=");

            String nameProduct = tokens[0];
            Double coust = Double.parseDouble(tokens[1]);

            try {
                productsMap.putIfAbsent(tokens[0], new Product(nameProduct, coust));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }

        String line = this.scanner.nextLine();

        while (!line.equals("END")) {
            String[] tokens = line.split(" ");

            String name = tokens[0];
            String productName = tokens[1];

            if (peopleMap.containsKey(name) && productsMap.containsKey(productName)) {
                try {
                    peopleMap.get(name).buyProduct(productsMap.get(productName));
                    System.out.printf("%s bought %s%n", name, productName);
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
            }

            line = this.scanner.nextLine();
        }

        if (!peopleMap.isEmpty()) {
            peopleMap.entrySet().forEach(x -> {
                List<String> products = new ArrayList<>();
                if (x.getValue().getProducts().isEmpty()) {
                    products.add("Nothing bought");
                } else {
                    x.getValue().getProducts().forEach(s -> products.add(s.getName()));
                }

                System.out.println(x.getKey() + " - " + String.join(", ", products));
            });
        }
    }
}
