package DayFive.Bitwise_Operation;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Tri_BitSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int mask = 7;
        mask = mask<<7;
        System.out.println(n^mask);




    }
}
