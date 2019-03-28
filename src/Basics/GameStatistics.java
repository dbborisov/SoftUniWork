package Basics;

import java.util.Scanner;

public class GameStatistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        if (time == 0) {
            System.out.println("Match has just began!");
        } else if (time < 45) {
            System.out.println("First half time.");
            if (time > 0 && time <= 10) {
                System.out.println(name + " missed a penalty.");
                if (time % 2 == 0) {
                    System.out.println(name + " was injured after the penalty.");
                }
            } else if (time > 10 && time <= 35) {
                System.out.println(name + " received yellow card.");
                if (time % 2 != 0) {
                    System.out.println(name + " got another yellow card.");
                }

            } else if (time > 35 && time < 45) {
                System.out.println(name + " SCORED A GOAL !!!");
            }
        } else {

            System.out.println("Second half time.");
            if (time >45 && time <= 55) {
                System.out.println(name + " got a freekick.");
                if (time % 2 == 0) {
                    System.out.println(name + " missed the freekick.");

                }
            }else if (time <= 80 && time > 55) {
                System.out.println(name + " missed a shot from corner.");

                if (time % 2 != 0) {
                    System.out.println(name + " has been changed with another player.");

                }

            }else if ( time >80 && time <= 90) {
                System.out.println(name + " SCORED A GOAL FROM PENALTY !!!");
            }

        }
    }
}
