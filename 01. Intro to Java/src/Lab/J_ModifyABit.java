package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class J_ModifyABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elements = Arrays
               .stream(scanner.nextLine().split("\\s"))
               .mapToInt(Integer::valueOf)
               .toArray();

        Integer n = elements[0];
        Integer p = elements[1];
        Integer v = elements[2];

        int result = 0;

        if (v == 1 ) {
            int mask = v << p;
            result = n | mask;
        }
        if (v == 0) {
            int mask = ~(1 << p);
            result = n & mask;
        }

        System.out.println(result);
    }
}
