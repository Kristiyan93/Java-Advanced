package Lab.E_StaticIdAndRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, BankAccount> map =new HashMap<>();
        Integer id = 0;

        String input = reader.readLine();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Create":
                    map.put(++id, new BankAccount());
                    map.get(id).setId(id);
                    System.out.println("Account " + map.get(id).toString() +" created");
                    break;
                case "Deposit":
                    int targetId = Integer.valueOf(command[1]);
                    if (map.containsKey(targetId)){
                        map.get(targetId).deposit(Double.valueOf(command[2]));
                        DecimalFormat df = new DecimalFormat("#.##");
                        System.out.printf("Deposited %s to %s%n", df.format(Double.valueOf(command[2])), map.get(targetId).toString());
                    } else {
                        System.out.println("Account does not exist");
                    }

                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.valueOf(command[1]));
                    break;
                case "GetInterest":
                    targetId = Integer.valueOf(command[1]);

                    if (map.containsKey(targetId)){
                        DecimalFormat df = new DecimalFormat("0.00");
                        System.out.println(df.format(map.get(targetId).getInterest(Integer.valueOf(command[2]))));
                    } else {
                        System.out.println("Account does not exist");
                    }

                    break;
            }

            input = reader.readLine();
        }
    }
}
