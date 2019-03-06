package DayFive.Bitwise_Operation;

import java.util.Arrays;
import java.util.Scanner;

public class oddTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int result = n[0];

        for (int i = 1; i <n.length ; i++) {

            result = result ^ n[i] ;
        }
        System.out.println(result);
    }
}
