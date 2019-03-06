package DayThree;

import java.util.Scanner;

public class Read_arr_from_Line {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
        String[] stringSplit = in.split(" ");
        int[] numbers = new int[stringSplit.length];
        int i =0;
        int sum =0;
        for (String on:stringSplit) {
            int num =Integer.parseInt(on);
            numbers[i++]=num;

        }
        for (int j = 0; j <numbers.length ; j++) {

            if(numbers[j] %2 ==0){
                sum +=numbers[j];
            }

        }
        System.out.println(sum);

    }
}
