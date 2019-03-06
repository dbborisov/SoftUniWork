package excamePreparation;

import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int partySize = scanner.nextInt();

        int daysAdvanture = scanner.nextInt();
        int cois = 0;


        for (int i = 1; i <= daysAdvanture; i++) {

            if (i % 10 == 0) {
                partySize -= 2;
            }
            if (i % 15 == 0) {
                partySize += 5;

            }


            cois += 50;
            cois -= (2 * partySize);


            if (i % 3 == 0) {
                cois -= partySize * 3;


            }
            if (i % 5 == 0) {
                cois += partySize * 20;
                if (i % 3 == 0) {
                    cois -= partySize * 2;
                }
            }

        }
        System.out.printf("%d companions received %d coins each.", partySize, cois / partySize);


    }
}
