package daySix.homework.gread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Students> students = new ArrayList<>();

        for (int i = 0; i < n ; i++) {

            String[] in = scanner.nextLine().split("\\s+");

            Students student = new Students(in[0],in[1],Double.parseDouble(in[2]));
            students.add(student);
        }
        students.stream().sorted((p1,p2)->Double.compare(p2.getGrade(),p1.getGrade())).forEach(e ->{
            System.out.println(String.format("%s %s: %.2f",e.getFirsName(),e.getLastName(),e.getGrade()));
        });
    }
}
