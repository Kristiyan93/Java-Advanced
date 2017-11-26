package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_XBits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = new String[8];
        Integer count = 0;

        for (int i = 0; i < 8; i++) {
            int num = Integer.parseInt(reader.readLine());
            String binary = String.format("%32s",Integer.toBinaryString(num)).replace(' ', '0');
            elements[i] = binary;
        }

        for (int i = 0; i < elements.length - 2; i++) {
            for (int j = 0; j < elements[i].length() - 2; j++) {
                String a = elements[i].charAt(j) +
                        "" + elements[i].charAt(j + 1) +
                        "" + elements[i].charAt(j + 2);
                String b = elements[i + 1].charAt(j) +
                        "" + elements[i + 1].charAt(j + 1) +
                        "" + elements[i + 1].charAt(j + 2);
                String c = elements[i + 2].charAt(j) +
                        "" + elements[i + 2].charAt(j + 1) +
                        "" + elements[i + 2].charAt(j + 2);

                if (a.equals("101") && b.equals("010") && c.equals("101")) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
