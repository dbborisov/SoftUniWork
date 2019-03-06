package SecondDay;

import java.util.Scanner;

public class Home_SpiceMustFlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());

        if (first < 100) {
            System.out.println(0);
            System.out.println(0);
        } else {
            //int space = first;
            // int yied = first;
            int days = 0;
            int sum = 0;

            while (first >= 100) {
                int add = first - 26;
                first = first - 10;
                sum = sum + add;
                days++;
            }
            sum = sum - 26;
            System.out.println(days);
            System.out.println(sum);

        }
    }
}