package FirstDay;

import java.util.Scanner;

public class Practice_Division {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());
        int division = 0;

        for (int i = 1; i <= 10; i++) {

            if (num % i == 0) {
                if (i == 2) {
                    division = i;
                } else if (i == 3) {
                    division = i;
                } else if (i == 6) {
                    division = i;
                } else if (i == 7) {
                    division = i;
                } else if (i == 10) {
                    division = i;
                }
            }

        }
        if (division == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.println("The number is divisible by " + division);
        }

    }
}
