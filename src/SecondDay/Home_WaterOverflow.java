package SecondDay;

import java.util.Scanner;

public class Home_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 0xFF;
//        System.out.println(capacity);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int liters = 0;
        for (int i = 0; i < n; i++) {

            liters = Integer.parseInt(scanner.nextLine());
            sum += liters;
            if (capacity<sum) {
                System.out.println("Insufficient capacity!");
                sum-=liters;


            }

        }
        System.out.println(sum);
    }
}
