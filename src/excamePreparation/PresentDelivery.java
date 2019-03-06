package excamePreparation;

import java.util.Arrays;
import java.util.Scanner;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] house = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        int index = 0;
        String command = "";

        while (!"Merry Xmas!".equals(command = scanner.nextLine())) {

            String[] cmd = command.split(" ");
            int jump = Integer.parseInt(cmd[1]);

            if (index + jump >= house.length) {
                index = (jump % house.length) + index;
                index = index % house.length;

            } else {
                index = index + jump;
            }
            if (house[index] == 0) {
                System.out.println("House " + index + " will have a Merry Christmas.");
                continue;
            }


            if (house[index] > 0) {
                house[index] = house[index] - 2;
            } else if (house[index] <= 0) {

                house[index] = 0;

            }


        }

        System.out.println("Santa's last position was " + index + ".");
        int cout = 0;
        for (int i = 0; i < house.length; i++) {
            if (house[i] != 0) {
                cout++;
            }

        }
        if (cout > 0) {
            System.out.println("Santa has failed " + cout + " houses.");
        } else {
            System.out.println("Mission was successful.");
        }
    }
}
