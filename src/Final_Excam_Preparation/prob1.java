package Final_Excam_Preparation;

import java.util.*;

public class prob1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> book = new LinkedHashMap<>();

        String[] in = scanner.nextLine().split(" \\| ");
        for (int i = 0; i < in.length; i++) {

            String[] cmd = in[i].split(": ");

            if (!book.containsKey(cmd[0])) {
                book.putIfAbsent(cmd[0], new ArrayList<>());
                book.get(cmd[0]).add(cmd[1]);
            } else if (book.containsKey(cmd[0])) {
                book.get(cmd[0]).add(cmd[1]);
            }

        }

        in = scanner.nextLine().split(" \\| ");


        for (int i = 0; i < in.length; i++) {

            String cmd = in[i];
            if (book.containsKey(cmd)) {
                System.out.println(cmd);

                book.get(cmd).stream().sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.length(), e1.length());
                    return sort;
                }).forEach(e -> {
                    System.out.println(String.format(" -%s", e.toString().replaceAll("\\]", "")).replaceAll("\\[", ""));
                });
            }

        }

        if ("List".equals(scanner.nextLine())) {
            book.keySet().stream().sorted().forEach(e->{
                System.out.print(e+" ");
            });
        }


    }
}
