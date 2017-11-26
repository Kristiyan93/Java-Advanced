package Lab;

import java.util.Scanner;

public class I_ExtractABitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.next());
        Integer p = Integer.parseInt(scanner.next());

        int mask = n >> p;
        int bit = mask & 1;

        System.out.println(bit);
    }
}
