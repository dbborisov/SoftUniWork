package MapAndLambda.HomeWork;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SoftUniExamResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



                Map<String, Integer> map = new TreeMap<>();
                Map<String, Integer> totalMap = new TreeMap<>();
                while (true) {
                    String add = scanner.nextLine();
                    if (add.equals("exam finished")) {
                        break;
                    }
                    String[] mas = add.split("-");
                    String username = mas[0];
                    String command = mas[1];
                    if (command.equals("banned")) {
                        map.remove(username);
                    } else {
                        int points = Integer.parseInt(mas[2]);
                        map.putIfAbsent(username, points);
                        totalMap.putIfAbsent(command, 0);
                        if (totalMap.containsKey(command)) {
                            totalMap.put(command, totalMap.get(command) + 1);
                        }
                    }
                }
                AtomicInteger count = new AtomicInteger();
                AtomicInteger countTwo = new AtomicInteger();
                map.entrySet().stream().sorted((e, e1) -> {
                    int sort = Integer.compare(e1.getValue(), e.getValue());
                    e.getKey().compareTo(e1.getKey());
                    return sort;
                }).forEach(toPr -> {
                    if (count.get() == 0) {
                        System.out.println("Results:");
                    }
                    count.addAndGet(1);
                    System.out.printf("%s | %d%n", toPr.getKey(), toPr.getValue());
                });
                totalMap.entrySet().stream().sorted((e, e1) -> {
                    int sort = Integer.compare(e1.getValue(), e.getValue());
                    e.getKey().compareTo(e1.getKey());
                    return sort;
                }).forEach(e -> {
                    if (countTwo.get() == 0) {
                        System.out.println("Submissions:");
                    }
                    countTwo.addAndGet(1);
                    System.out.printf("%s - %s%n", e.getKey(), e.getValue());
                });


    }
}
