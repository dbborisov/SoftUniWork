package Regex.HomeWork;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Double> playars = new LinkedHashMap<>();
        Pattern pattern1 = Pattern.compile("(?<nums>[0-9]{1})");
        Pattern pattern = Pattern.compile("(?<playare>[A-Z]*[a-z]*)");

        String[] in = scanner.nextLine().split(", ");
        for (int i = 0; i < in.length; i++) {
            playars.put(in[i], 0.0);

        }
        while (!"end of race".equals(in[0] = scanner.nextLine())) {
            String command = in[0];
            int sum = 0;
            String play = "";
            Matcher name = pattern.matcher(command);
            Matcher num = pattern1.matcher(command);
            while (num.find()) {

                sum += Integer.parseInt(num.group("nums"));
            }
            while (name.find()) {
                play += name.group("playare");

            }
            if (playars.containsKey(play)) {
                playars.put(play, playars.get(play) + sum);
            }


        }
        List<String> out = playars.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).map(Map.Entry::getKey).collect(Collectors.toList());

        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                System.out.println("1st place: " + out.get(0));
            } else if (i == 1) {
                System.out.println("2nd place: " + out.get(1));
            } else if (i == 2) {
                System.out.println("3rd place: " + out.get(2));
            }

        }
    }
}
