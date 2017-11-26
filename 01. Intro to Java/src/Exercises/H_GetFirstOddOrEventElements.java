package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class H_GetFirstOddOrEventElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] inputTokkens = scanner.nextLine().split("\\s+");

        int numbers = Integer.parseInt(inputTokkens[1]);
        String oddEven = inputTokkens[2];

        if(oddEven.equals("odd")){
            for (int i = 0; i < array.length ; i++) {
                if(Math.abs(array[i] % 2) == 1){
                    System.out.printf("%d ",array[i]);
                    numbers --;
                }
                if(numbers == 0){
                    return;
                }
            }
        } else if(oddEven.equals("even")){
            for (int i = 0; i < array.length ; i++) {
                if(Math.abs(array[i] % 2) == 0){
                    System.out.printf("%d ",array[i]);
                    numbers --;
                }

                if(numbers <= 0){
                    return;
                }
            }
        }
    }
}
