package excamePreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quests_Journal_ver2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String in = reader.readLine();

        List<String> quests = Arrays.stream(in.split(", ")).collect(Collectors.toList());

        while (!"Retire!".equals(in = reader.readLine())) {

            String[] command = in.split(" - ");

            switch (command[0]) {

                case "Start":
                    if (!quests.contains(command[1])) {
                        quests.add(command[1]);
                    }
                    break;
                case "Complete":

                    if (quests.contains(command[1])) {
                        int index = quests.indexOf(command[1]);
                        quests.remove(index);
                    }

                    break;

                case "Renew":
                    if (quests.contains(command[1])) {
                        int index = quests.indexOf(command[1]);
                        String swap = quests.get(index);
                        quests.add(swap);
                        quests.remove(index);
                    }

                    break;
                default:
                    String[] sideQ = command[1].split(":");
                    if (quests.contains(sideQ[0])) {
                        int index = quests.indexOf(sideQ[0]);

                        if (!quests.contains(sideQ[1])) {
                            quests.add(index + 1, sideQ[1]);
                        }
                    }
                    break;
            }
        }


        System.out.println(quests.toString().replaceAll("[\\[\\]]",""));
    }

}
