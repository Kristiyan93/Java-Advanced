package Exercises.D_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<Employee>> departments = new HashMap<>();

        Integer n = Integer.valueOf(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" ");

            Employee employee = null;

            switch (tokens.length) {
                case 6:
                    employee = new Employee(tokens[0], Double.parseDouble(tokens[1]),
                            tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]));
                    break;
                case 5 :
                    try {
                        employee = new Employee(tokens[0], Double.parseDouble(tokens[1]),
                                tokens[2], tokens[3],Integer.parseInt(tokens[4]));
                    } catch (Exception e) {
                        employee = new Employee(tokens[0], Double.parseDouble(tokens[1]),
                                tokens[2], tokens[3], tokens[4]);
                    }
                    break;
                case 4 :
                    employee = new Employee(tokens[0], Double.parseDouble(tokens[1]),
                            tokens[2], tokens[3]);
                    break;
            }

            departments.putIfAbsent(tokens[3], new ArrayList<>());
            departments.get(tokens[3]).add(employee);
        }

        departments.entrySet()
                .stream()
                .sorted((a, b) -> Double.compare(b.getValue().stream().mapToDouble(Employee::getSalary).sum(),
                        a.getValue().stream().mapToDouble(Employee::getSalary).sum()))
                .limit(1)
                .forEach(x -> {
                    System.out.printf("Highest Average Salary: %s%n", x.getKey());
                    x.getValue().stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                            .forEach(a -> System.out.printf("%s %.2f %s %d%n", a.getName(), a.getSalary(), a.getEmail(), a.getAge()));
                });
    }
}
