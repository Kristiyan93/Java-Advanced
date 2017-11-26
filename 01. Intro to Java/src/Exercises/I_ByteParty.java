package Exercises;

import java.util.Scanner;

public class I_ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        int[] element = new int[n];

        for (int i = 0; i < n; i++) {
            element[i] = Integer.parseInt(scanner.nextLine());
        }

        String input = scanner.nextLine();

        while (!input.equals("party over")) {
            String[] tokens = input.split("\\s");
            Integer v = Integer.parseInt(tokens[0]);
            Integer p = Integer.parseInt(tokens[1]);

            switch (v) {
                case -1:
                    for (int i = 0; i < element.length; i++) {
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(element[i])));
                        int mask = 1 << p;
                        element[i] = element[i] ^ mask;
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(mask)));
                        //System.out.println("---------------------------------------------------");
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(element[i])));
                        //System.out.println("===================================================");
                    }
                    break;
                case 0:
                    for (int i = 0; i < element.length; i++) {
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(element[i])));
                        int mask = ~(1 << p);
                        element[i] = element[i] & mask;
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(mask)));
                        //System.out.println("---------------------------------------------------");
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(element[i])));
                        //System.out.println("===================================================");
                    }
                    break;
                case 1:
                    for (int i = 0; i < element.length; i++) {
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(element[i])));
                        int mask = 1 << p;
                        element[i] = element[i] | mask;
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(mask)));
                        //System.out.println("---------------------------------------------------");
                        //System.out.printf("%016d%n", Integer.parseInt(Integer.toBinaryString(element[i])));
                        //System.out.println("===================================================");
                    }
                    break;
                    default:
                        break;
            }

            input = scanner.nextLine();
        }

        for (int i : element) {
            System.out.println(i);
        }
    }
}
