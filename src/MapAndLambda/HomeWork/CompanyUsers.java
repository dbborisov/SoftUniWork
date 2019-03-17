package MapAndLambda.HomeWork;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = "";
        Map<String, List<String>> compani = new LinkedHashMap<>();

        while (!"End".equals(in = scanner.nextLine())) {

            String[] command = in.split(" -> ");
            String compan = command[0];
            String name = command[1];
            if (!compani.containsKey(compan)) {
                List<String> employ = new ArrayList<>();
                employ.add(name);
                compani.put(compan, employ);
            } else if (compani.containsKey(compan)) {
                List<String> oldStudents = compani.get(compan);
                if(oldStudents.contains(name)){
                    continue;
                }
                List<String> newStudents = oldStudents;
                newStudents.add(name);
                compani.put(compan, newStudents);
            }

        }
        compani.entrySet().stream().sorted((e1,e2)->e1.getKey().compareTo(e2.getKey())).forEach(e->{
            System.out.println(String.format("%s",e.getKey()));
            List<String> students =e.getValue().stream().sorted().collect(Collectors.toList());
            int index=e.getValue().size();
            for (int i = 0; i <index ; i++) {
                System.out.println("-- "+students.get(i));

            }
        });

    }
}



