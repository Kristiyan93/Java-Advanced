package Lab;

import java.util.*;

public class B_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        int[] encryptedArray = encryptArray(names);
        Arrays.sort(encryptedArray);

        printArray(encryptedArray);
    }

    private static int[] encryptArray(String[] lines) {
        int[] encryptedArray = new int[lines.length];

        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u','A','E','I','O','U');
        for (int i = 0; i < lines.length; i++) {
            int sum = 0;

            for (int j = 0; j < lines[i].length(); j++) {
                if (vowels.contains(lines[i].charAt(j))) {
                    sum += (int) (lines[i].charAt(j)) * lines[i].length();
                } else {
                    sum += (int) (lines[i].charAt(j)) / lines[i].length();
                }
            }
            encryptedArray[i] = sum;
        }
        return encryptedArray;
    }

    private static void printArray(int[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}