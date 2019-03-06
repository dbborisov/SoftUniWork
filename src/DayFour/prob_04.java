package DayFour;

import java.util.Scanner;

public class prob_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());


        double area = calcArea( width, height);
        System.out.printf("%.0f",area);
    }

    private static double calcArea(double width, double height) {
        double sum = width*height;
        return sum;
    }
}
