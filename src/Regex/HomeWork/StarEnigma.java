package Regex.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StarEnigma {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String crypt = "";
        Map<String, List<String>> planet = new TreeMap<>();
        planet.put("A", new ArrayList<>());
        planet.put("D", new ArrayList<>());
        Pattern decriptPattern = Pattern.compile("@(?<planet>[A-Z][a-z]*)(?:[^@\\-!:>.]*):" +
                "(?<population>[0-9]+)!(?:[^@\\-!:>.]*)" +
                "(?<atack>[AaDd])(?:[^@\\-!:>.]*)!(?:[^@\\-!:>.]*)->(?:[^@\\-!:>.]*)" +
                "(?<soldiers>[0-9]+)(?:[^@\\-!:>.]*)");

        for (int i = 0; i < n; i++) {
            String decrypt = "";

            crypt = reader.readLine();
            int key = keyExtract(crypt);

            for (int j = 0; j < crypt.length(); j++) {


                decrypt += (char) (crypt.charAt(j) - key);

            }
            Matcher matcher = decriptPattern.matcher(decrypt);
            String namePlanet = "";
            String atack = "";

            while (matcher.find()) {
                namePlanet += matcher.group("planet");
                atack += matcher.group("atack");
            }

            if (atack.equals("A")) {
                List<String> newValue = planet.get(atack);
                newValue.add(namePlanet);
                planet.put(atack, newValue);
            } else if (atack.equals("D")) {
                List<String> newValue = planet.get(atack);
                newValue.add(namePlanet);
                planet.put(atack, newValue);
            }
        }
        planet.entrySet().stream().forEach(e1 -> {
            List<String> out = e1.getValue().stream().sorted().collect(Collectors.toList());
            if (e1.getKey().equals("A")) {
                System.out.println(String.format("Attacked planets: %d", e1.getValue().size()));

                for (int i = 0; i < e1.getValue().size(); i++) {
                    System.out.println(String.format("-> %s", out.get(i)));
                }

            } else {
                System.out.println(String.format("Destroyed planets: %d", e1.getValue().size()));
                for (int i = 0; i < e1.getValue().size(); i++) {
                    System.out.println(String.format("-> %s", out.get(i)));
                }
            }
        });

    }

    private static int keyExtract(String in) {

        String mach = "";
        Pattern pattern = Pattern.compile("[sStTaArR]*");
        Matcher matcher = pattern.matcher(in);
        while (matcher.find()) {

            mach += matcher.group(0);
        }


        return mach.length();
    }
}
