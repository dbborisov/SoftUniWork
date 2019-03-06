package FirstDay;

import java.util.Scanner;

public class Practice_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int losteGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keybordPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());


        double expenses = (losteGamesCount / 2) * headsetPrice +
                (losteGamesCount / 3) * mousePrice +
                (losteGamesCount / 6) * keybordPrice +
                (losteGamesCount / 12) * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",expenses);

    }
}
