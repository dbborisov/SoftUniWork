package DayFour.atHome;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 =Integer.parseInt(scanner.nextLine());
        int num2 =Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",facurial(num1)/facurial(num2));
    }
    static double facurial(int num){
       double sum = 1;

            for (int j = num; j >1 ; j--) {
                sum*=j;
            }

            return sum;


    }
}
