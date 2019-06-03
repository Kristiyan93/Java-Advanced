package Exercises.A_Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputName = reader.readLine();
        Integer inputAge = Integer.parseInt(reader.readLine());

        Child child = null;

        try {
            child = new Child(inputName, inputAge);
            System.out.println(child.toString());
        }catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
