package DayThree;

import java.util.Scanner;

public class PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int [n];

        for (int i = 0; i <array.length;i++){

            int num = Integer.parseInt(scanner.nextLine());
            array[i]=num;

        }
        for (int i = array.length-1; i >= 0; i--) {

            System.out.print(array[i]+" ");

//            int num = array[i];
//            array[]=num;

        }

    }
}
