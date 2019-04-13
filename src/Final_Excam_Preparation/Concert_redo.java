package Final_Excam_Preparation;

import java.util.*;

public class Concert_redo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> band = new LinkedHashMap<>();
        Map<String, Long> bandTime = new LinkedHashMap<>();

        String in = "";

        while (!"start of concert".equals(in = scanner.nextLine())) {
            String command = in.split("; ")[0];
            String bandName = in.split("; ")[1];
            if (command.equals("Add")) {
                String[] bandMembers = in.split("; ")[2].split(", ");
                if (!band.containsKey(bandName)) {
                    band.put(bandName, new ArrayList<>());
                    bandTime.put(bandName, 0L);

                }
                for (int i = 0; i < bandMembers.length; i++) {
                    if (!band.get(bandName).contains(bandMembers[i])) {
                        band.get(bandName).add(bandMembers[i]);
                    }
                }

            } else {
                Long time = Long.parseLong(in.split("; ")[2]);

                if (bandTime.containsKey(bandName)) {
                    bandTime.put(bandName, bandTime.get(bandName) + time);
                } else {
                    if (!band.containsKey(bandName)) {
                        band.put(bandName, new ArrayList<>());
                    }
                    bandTime.put(bandName, time);
                }

            }


        }
        in = scanner.nextLine();
        System.out.println("Total time: " + bandTime.values().stream().mapToLong(Long::intValue).sum());
        bandTime.entrySet().stream().sorted((e1, e2) -> {
            int sum = Long.compare(e2.getValue(), e1.getValue());

            if (sum == 0) {
                sum = e1.getKey().compareTo(e2.getKey());
            }

            return sum;
        }).forEach(e -> {
            System.out.println(e.getKey() + " -> " + e.getValue());
        });
        System.out.println(in);
        band.get(in).stream().forEach(e -> {
            System.out.println("=> " + e);
        });

//        System.out.println(band + "  " + bandTime);
    }
}
