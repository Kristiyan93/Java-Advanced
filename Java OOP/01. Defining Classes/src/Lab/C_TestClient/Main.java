package Lab.C_TestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, BankAccount> accounts = new HashMap<>();

        String command = reader.readLine();

        while (!command.equals("End")) {
            String[] tokens = command.split(" ");
            String commandType = tokens[0];

            switch (commandType) {
                case "Create":
                    createCommand(accounts, tokens[1]);
                    break;
                case "Deposit":
                    depositCommand(accounts, tokens[1], tokens[2]);
                    break;
                case "Withdraw":
                    withdrawCommand(accounts, tokens[1], tokens[2]);
                    break;
                case "Print":
                    printCommand(accounts, tokens);
                    break;
            }

            command = reader.readLine();
        }
    }

    private static void printCommand(Map<Integer, BankAccount> accounts, String[] tokens) {
        Integer id = Integer.valueOf(tokens[1]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }

        BankAccount account = accounts.get(id);

        System.out.println(account);
    }

    private static void withdrawCommand(Map<Integer, BankAccount> accounts, String token, String token1) {
        Integer id = Integer.valueOf(token);
        Double amount = Double.valueOf(token1);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }

        try {
            accounts.get(id).withdraw(amount);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private static void depositCommand(Map<Integer, BankAccount> accounts, String token, String token1) {
        Integer id = Integer.valueOf(token);
        Double amount = Double.valueOf(token1);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }

        try {
            accounts.get(id).deposit(amount);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private static void createCommand(Map<Integer, BankAccount> accounts, String token) {
        Integer id = Integer.valueOf(token);

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccount acc = new BankAccount();
            acc.setID(id);
            accounts.put(id, acc);
        }
    }
}
