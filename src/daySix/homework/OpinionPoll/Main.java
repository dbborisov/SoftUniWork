package daySix.homework.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            if(Integer.parseInt(data[1])>30) {
                Person person = new Person(data[0], Integer.parseInt(data[1]));
                persons.add(person);
            }

        }

        persons.stream().sorted((p1,p2) ->p1.getName().compareTo(p2.getName())).forEach(person -> {
            System.out.println(person.toString());
        });





    }
}
