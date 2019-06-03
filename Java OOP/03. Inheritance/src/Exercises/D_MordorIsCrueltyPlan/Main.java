package Exercises.D_MordorIsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Gandalf gandalf = new Gandalf();

        String[] inputFoods = reader.readLine().split("\\s+");

        for (String inputFood : inputFoods) {
            gandalf.eatFood(inputFood.toLowerCase());
        }

        gandalf.setMode();
        System.out.println(gandalf.getPoints());
        System.out.println(gandalf.getMode());
    }
}