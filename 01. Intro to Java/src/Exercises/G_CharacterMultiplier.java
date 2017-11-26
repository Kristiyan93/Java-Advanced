package Exercises;

import java.util.Scanner;

public class G_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        Integer sum = 0;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                sum += str1.charAt(i) * str2.charAt(i);
            }
        } else {
            if (str1.length() > str2.length()) {
                for (int i = 0; i < str2.length(); i++) {
                    sum += str2.charAt(i) * str1.charAt(i);
                }

                for (int i = str2.length(); i < str1.length(); i++) {
                    sum += str1.charAt(i);
                }
            } else {
                for (int i = 0; i < str1.length(); i++) {
                    sum += str2.charAt(i) * str1.charAt(i);
                }

                for (int i = str1.length(); i < str2.length(); i++) {
                    sum += str2.charAt(i);
                }
            }
        }

        System.out.printf("%d", sum);
    }
}