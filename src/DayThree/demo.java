package DayThree;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array =new int [3];
        array[0]=13;
        array[1]=113;
        array[2]=1;

        int sum = 0;

        for (int i = 0; i <array.length ; i++) {
            sum+=array[i]+13;
            System.out.println(array[i]);

        }
        System.out.println();


    }
}
