package exercise;

import java.util.Scanner;

public class LadyBugs_1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int fildSize = Integer.parseInt(scanner.nextLine());

        String[] indeces = scanner.nextLine().split(" ");
        int[] field = new int[fildSize];

        for (int i = 0; i < indeces.length; i++) {

            int index = Integer.parseInt(indeces[i]);

            if (index >= 0 && index < fildSize) {
                field[index] = 1;

            }

        }

        String command = "";

        while (!"end".equals(command = scanner.nextLine())) {
            String[] cmdArgs = command.split(" ");
            int index = Integer.parseInt(cmdArgs[0]);
            String cmd = cmdArgs[1];
            int flyLenght = Integer.parseInt(cmdArgs[2]);


            if (index < 0 || index > field.length - 1 || field[index] == 0) {
                continue;
            }

            field[index] = 0;
            if (cmdArgs[1].equals("right")) {
                index += flyLenght;

                while (index < fildSize && field[index] == 1) {
                    index += flyLenght;
                }

                if (index < fildSize) {
                    field[index] = 1;
                }
            }else {

                index -= flyLenght;

                while (index >= 0 && field[index] == 1) {
                    index -= flyLenght;
                }

                if (index >= 0) {
                    field[index] = 1;
                }

            }

        }

        String out ="";

        for (int i = 0; i <field.length ; i++) {

            out+= field[i]+ " ";
        }
        System.out.println(out.trim());

    }
}
