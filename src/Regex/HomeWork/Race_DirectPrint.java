package Regex.HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("ALL")
public class Race_DirectPrint {
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
        AtomicInteger count = new AtomicInteger();
       playars.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).limit(3).forEachOrdered(e1->{

           count.getAndIncrement();
           if (count.get()==  1) {
                System.out.println("1st place: " + e1.getKey());
            } else if (count.get()==2) {
                System.out.println("2nd place: " + e1.getKey());
            } else if (count.get() == 3) {
                System.out.println("3rd place: " + e1.getKey());
            }
        });

    }
}
