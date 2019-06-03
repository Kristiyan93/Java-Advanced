package Exercises.G_CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Custom<String> list = new Custom<>();

        String[] input = reader.readLine().split(" ");

        while (!input[0].equals("END")) {
            switch (input[0]) {
                case "Add":
                    list.addElement(input[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(input[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(input[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    break;
                case "Contains":
                    System.out.println(list.contains(input[1]));
                    break;
                case "Print":
                    System.out.println(list);
                    break;
                case "Sort":
                    list.sort();
                    break;
                    default:
                        break;
            }

            input = reader.readLine().split(" ");
        }
    }
}
