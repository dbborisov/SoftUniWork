package MapAndLambda.HomeWork;

import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String in = "";
        Map<String, List<String>> clasess = new LinkedHashMap<>();



        while (!"end".equals(in = scanner.nextLine())){

            String[] command = in.split(" : ");
            String clasS = command[0];
            String name = command[1];

            if (!clasess.containsKey(clasS)){
                List<String> student = new ArrayList<>();
                student.add(name);
                clasess.put(clasS,student);
            }else if(clasess.containsKey(clasS)){
                List<String> oldStudents = clasess.get(clasS);
//                List<String> newStudents = oldStudents;
                oldStudents.add(name);
                clasess.put(clasS,oldStudents);
            }

        }

        clasess.entrySet().stream().sorted((e1,e2)->Integer.compare(e2.getValue().size(),e1.getValue().size())).forEach(e->{
            System.out.println(String.format("%s: %d",e.getKey(),e.getValue().size()));
            List<String> students =e.getValue().stream().sorted().collect(Collectors.toList());
            int index=e.getValue().size();
            for (int i = 0; i <index ; i++) {
                System.out.println("-- "+students.get(i));

            }
        });


    }
}
