package MapAndLambda.HomeWork;

import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>>studentsGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            List<Double> listGrades  = new ArrayList<>();
            listGrades.add(grade);

            if(!studentsGrades.containsKey(name)){
                studentsGrades.put(name,listGrades);

            } else if (studentsGrades.containsKey(name)) {
                List<Double> newListGrade = studentsGrades.get(name);
                newListGrade.add(grade);

                studentsGrades.put(name,newListGrade);

            }

        }
        Map<String,Double> print = new LinkedHashMap<>();
        for (Map.Entry<String,List<Double>> s : studentsGrades.entrySet()) {
            double average = s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            String name = s.getKey();
            print.put(name,average);

        }


//       studentsGrades.entrySet().stream().forEach(e ->{
//           double a =e.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
//           System.out.println(String.format("%s -> %.2f",e.getKey(),a));
//       });
        print.entrySet().stream().sorted((e1,e2)->Double.compare(e2.getValue(),e1.getValue())).filter(e->e.getValue()>=4.5).forEach(e->{
            System.out.println(String.format("%s -> %.2f",e.getKey(),e.getValue()));
        });

    }
}
