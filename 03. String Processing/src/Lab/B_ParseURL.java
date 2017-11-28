package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_ParseURL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("://");

        if (input.length == 2) {
            String protocol = input[0];
            Integer indexForServer = input[1].indexOf("/");
            String server = input[1].substring(0, indexForServer);
            String resources = input[1].substring(indexForServer + 1, input[1].length());

            System.out.printf("Protocol = %s%nServer = %s%nResources = %s%n", protocol, server, resources);
        } else {
            System.out.println("Invalid URL");
        }
    }
}
