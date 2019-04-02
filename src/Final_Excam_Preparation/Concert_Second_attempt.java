package Final_Excam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class Concert_Second_attempt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = "";
        Map<String, List<String>> bandMember = new LinkedHashMap<>();
        Map<String, Integer> bandTime = new LinkedHashMap<>();

        while (!"start of concert".equals(in = scanner.nextLine())) {
            String[] command = in.split(";\\s+");
            String bandName = command[1];
            List<String> inBand = new ArrayList<>();
            int time = 0;
            if (command[0].equals("Add")) {
                inBand = Arrays.stream(command[2].split(",\\s+")).collect(Collectors.toList());
                if (!bandMember.containsKey(bandName)) {
                    bandMember.put(bandName, inBand);
                    bandTime.put(bandName, 0);
                } else {
                    for (String s : inBand) {
                        if (!bandMember.get(bandName).contains(s)) {
                            bandMember.get(bandName).add(s);
                        }

                    }
                }

            } else if (command[0].equals("Play")) {
                time = Integer.parseInt(command[2]);

                if (!bandTime.containsKey(bandName)) {
                    bandMember.put(bandName, new ArrayList<>());
                    bandTime.put(bandName, time);
                } else {
                    bandTime.put(bandName, bandTime.get(bandName) + time);
                }

            }
        }
        in = scanner.nextLine();

        System.out.println("Total time: " + bandTime.values().stream().mapToInt(Integer::intValue).sum());
        bandTime.entrySet().stream().sorted((e1, e2) -> {
            int sum = e2.getValue().compareTo(e1.getValue());
            if (sum == 0) {
                sum = e1.getKey().compareTo(e2.getKey());
            }
            return sum;
        }).forEach(e -> {
            System.out.println(String.format("%s -> %d", e.getKey(), e.getValue()));
        });
        System.out.println(in);
        bandMember.get(in).forEach(e -> System.out.println(String.format("=> %s", e)));
    }

}
