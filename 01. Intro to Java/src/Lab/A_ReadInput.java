package Lab;

import java.util.Scanner;

public class A_ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        String secondWord = scanner.next();
        Integer firstNum = Integer.parseInt(scanner.next());
        Integer secondNum = Integer.parseInt(scanner.next());
        Integer threNum = Integer.parseInt(scanner.next());
        String lastWord = scanner.next();

        scanner.nextLine();

        Integer sum = firstNum + secondNum + threNum;

        System.out.println(firstWord + " " + secondWord + " " + lastWord + " " + sum);
    }
}
