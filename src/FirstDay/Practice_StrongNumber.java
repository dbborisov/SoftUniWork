package FirstDay;

import java.util.Scanner;

public class Practice_StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < in.length(); i++) {
            char a = in.charAt(i);
            int num = Integer.parseInt("" + a);
            int factorial = 1;
            for (int j = 1; j <= num; j++) {

                factorial *= j;

            }
            sum += factorial;

        }

        if (in.equals(sum + "")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
