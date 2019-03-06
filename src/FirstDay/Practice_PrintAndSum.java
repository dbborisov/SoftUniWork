package FirstDay;

import java.util.Scanner;

public class Practice_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (; firstNum <=secondNum ; firstNum++) {
            sum+=firstNum;
            System.out.print(firstNum+" ");

        }
        System.out.println();
        System.out.println("Sum: "+sum);

    }
}
