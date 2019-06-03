package Exercises.D_Teleponyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Smartphone smart = new Smartphone();

        String[] phones = reader.readLine().split(" ");
        Arrays.stream(phones).forEach(n -> System.out.println(smart.calling(n)));

        String[] url = reader.readLine().split(" ");
        Arrays.stream(url).forEach(u -> System.out.println(smart.browsing(u)));
    }
}
