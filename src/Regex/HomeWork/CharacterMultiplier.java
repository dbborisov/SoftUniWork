package Regex.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");


        System.out.println(getCarDum(input));


    }

    private static int getCarDum(String[] input) {
        int sum = 0;
        int[] first = Arrays.stream(input[0].split("")).mapToInt(e -> {
            int ex = e.charAt(0);
            return ex;
        }).toArray();

        int[] second = Arrays.stream(input[1].split("")).mapToInt(value -> {
            int e = value.charAt(0);
            return e;
        }).toArray();

        String big = "";
        int index = 0;

        if (first.length > second.length) {
            big = "first";
            index = second.length;

            for (int i = 0; i < second.length; i++) {
                sum += first[i] * second[i];
            }
        } else {
            big = "second";
            index = first.length;
            for (int i = 0; i < first.length; i++) {
                sum += first[i] * second[i];
            }

        }
        if (first.length != second.length) {
            if (big.equals("first")) {
                for (int i = index; i < first.length; i++) {
                    sum += first[i];
                }
            } else {
                for (int i = index; i < second.length; i++) {
                    sum += second[i];
                }
            }
        }

        return sum;

    }
}
