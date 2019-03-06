package DayFive.Bitwise_Operation;

import java.util.Scanner;

public class BitShift {
    public static void main(String[] args) {
        //5 ->101 ->0
        //3 ->011 ->1
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        n= n >> 1 ;

        System.out.println(n &  1);
     }
}
