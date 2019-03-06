package daySix.homework.OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderCon> all = new ArrayList<>();

        String input = "";
        while (!"End".equals(input = scanner.nextLine())){

            String[] data = input.split("\\s+");

            OrderCon person = new OrderCon(data[0],data[1],Integer.parseInt(data[2]));
            all.add(person);



        }

        all.stream().sorted((p1,p2)->Integer.compare(p1.getAge(),p2.getAge())).forEach(e->{
            System.out.println(String.format("%s with ID: %s is %d years old.",e.getName(),e.getId(),e.getAge()));
        });

    }
}
