package DayFive.Bitwise_Operation;

import java.util.Scanner;

public class BiteDestroier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());


        int mask = 1 << p;
        mask = ~mask;
        System.out.println(n & mask);

    }
}
