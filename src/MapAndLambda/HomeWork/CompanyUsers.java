package MapAndLambda.HomeWork;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = "";
        Map<String, List<String>> compani = new TreeMap<>();

        while (!"End".equals(in = scanner.nextLine())) {
            compani = getCompani(in,compani);


        }
        compani.entrySet().stream().forEach(e -> {
            System.out.println(String.format("%s", e.getKey()));
            List<String> id = e.getValue().stream().collect(Collectors.toList());
            int index = e.getValue().size();
            for (int i = 0; i < index; i++) {
                System.out.println("-- " + id.get(i));

            }
        });

    }

    public static Map<String, List<String>> getCompani(String in, Map<String, List<String>> map) {


        String[] command = in.split(" -> ");
        String compan = command[0];
        String name = command[1].toUpperCase();
        if (!map.containsKey(compan)) {
            List<String> employ = new ArrayList<>();
            employ.add(name);
            map.put(compan, employ);
        } else if (map.containsKey(compan)) {
            List<String> oldStudents = map.get(compan);
            if (oldStudents.contains(name)) {
                return map;
            }
            List<String> newStudents = oldStudents;
            newStudents.add(name);
            map.put(compan, newStudents);

        }
        return map;
    }
}



