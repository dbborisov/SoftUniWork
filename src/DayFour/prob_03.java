package DayFour;

import java.util.Scanner;

public class prob_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printLine(i);
        }

        for (int i = n - 1; i > 0; i--) {
           printLine(i);
        }
    }


    public static void printLine(int n) {

        for (int j = 1; j <= n; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}