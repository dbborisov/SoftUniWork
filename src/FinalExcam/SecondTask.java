package FinalExcam;

import java.util.*;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> save = new LinkedHashMap<>();


        String in = "";

        while (!"END".equals(in = scanner.nextLine())) {
            String[] cmd = in.split("->");
            String action = cmd[0];
            String name = cmd[1];


            if (action.equals("Add")) {
                String[] list = cmd[2].split(",");
                if (!save.containsKey(name)) {
                    save.put(name, new ArrayList<>());
                }
                for (int i = 0; i < list.length; i++) {
                    save.get(name).add(list[i]);
                }

            } else {

                if (save.containsKey(name)) {
                    save.remove(name);
                }

            }
        }


        System.out.println("Stores list:");
        save.entrySet().stream().sorted((e, e1) -> {
            int sum = Integer.compare(e1.getValue().size(), e.getValue().size());
            if (sum == 0) {

                sum = e1.getKey().compareTo(e.getKey());
            }

            return sum;
        }).forEach(e -> {

            System.out.println(e.getKey());
            for (int i = 0; i < e.getValue().size(); i++) {
                System.out.println("<<" + e.getValue().get(i) + ">>");

            }
        });

    }
}
