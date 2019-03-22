package Regex.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ValidUserName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] out = input.split(",\\s+");
        System.out.println();
        Arrays.stream(out).forEach(e -> {
            if (e.matches("[A-Za-z0-9-_]{3,16}")) {
                System.out.println(e);
            }
        });

    }

}
