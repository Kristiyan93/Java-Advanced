package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class P_DragonArmy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, TreeMap<String, int[]>> dragonsStore =
                new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] inputTokens = reader.readLine().split(" ");
            String type = inputTokens[0];
            String name = inputTokens[1];
            int health = 250;
            int damage = 45;
            int armor = 10;

            if(!"null".equals(inputTokens[2])){
                damage = Integer.parseInt(inputTokens[2]);
            }
            if(!"null".equals(inputTokens[3])){
                health = Integer.parseInt(inputTokens[3]);
            }
            if(!"null".equals(inputTokens[4])){
                armor = Integer.parseInt(inputTokens[4]);
            }

            int[] parameters = {damage, health, armor};

            if(dragonsStore.containsKey(type)){
                dragonsStore.get(type).put(name, parameters);
            } else {
                TreeMap<String, int[]> params = new TreeMap<>();
                params.put(name, parameters);
                dragonsStore.put(type, params);
            }
        }

        DecimalFormat df = new DecimalFormat("0.00");
        String output = "";

        for (String s : dragonsStore.keySet()) {
            output += s + "::(";
            double avgDamage = 0;
            double avgHealth = 0;
            double avgArmor = 0;
            String temp = "";
            for (String s1 : dragonsStore.get(s).keySet()) {
                int d = dragonsStore.get(s).get(s1)[0];
                int h = dragonsStore.get(s).get(s1)[1];
                int a = dragonsStore.get(s).get(s1)[2];
                temp += "-" + s1 + " -> damage: " + d + ", health: " + h + ", armor: " + a + "\n";
                avgDamage += d;
                avgHealth += h;
                avgArmor += a;
            }

            avgDamage /= dragonsStore.get(s).size();
            avgHealth /= dragonsStore.get(s).size();
            avgArmor /= dragonsStore.get(s).size();
            output += df.format(avgDamage) + "/" + df.format(avgHealth) + "/" + df.format(avgArmor) + ")\n";
            output += temp;
        }

        System.out.println(output);
    }
}
