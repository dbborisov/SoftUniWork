package Stakcs_And_Queues.Home_Work;

import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inRobot = scanner.nextLine().split(";");
        Map<String,Integer> robotName = new LinkedHashMap<>();
        String startTime =scanner.nextLine();

        for (int i = 0; i < inRobot.length; i++) {
            String[] in =inRobot[i].split("-");

            robotName.put(in[0],Integer.parseInt(in[1]));
        }

       Deque<String> elements = new ArrayDeque<>();

        String cmd ="";

        while (!"End".equals(cmd=scanner.nextLine())){
            elements.add(cmd);
        }
        int time = 0;

        while (!elements.isEmpty()){
            for (int i = 0; i <robotName.size() ; i++) {

                

            }

        }

        System.out.println();

    }
}
