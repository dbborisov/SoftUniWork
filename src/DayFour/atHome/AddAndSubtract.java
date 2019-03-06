package DayFour.atHome;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numSec = Integer.parseInt(scanner.nextLine());
        int numThi = Integer.parseInt(scanner.nextLine());

        int sum = sum(numOne, numSec);
         sum = subtract(sum, numThi);
        System.out.println(sum);

    }
    static int sum(int numOne, int numSec) {
        int sum = numOne+numSec;
        return sum;
    }
    static  int subtract(int num , int num2){
       int sum = num-num2;

        return sum;

    }

}
