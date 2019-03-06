package DayFour.atHome;

import java.util.Scanner;

public class IntMatrix {
    public static void main(String[] args) {
        printMatrix(new Scanner(System.in).nextLine());
    }
    static void printMatrix(String a){
        int num =Integer.parseInt(a);

        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                System.out.print(a+" ");
            }
            System.out.println();

        }

    }
}
