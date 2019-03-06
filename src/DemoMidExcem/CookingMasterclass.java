package DemoMidExcem;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int    students = Integer.parseInt(scanner.nextLine());
        double flour = Double.parseDouble(scanner.nextLine());
        double egg = Double.parseDouble(scanner.nextLine());
        double apron = Double.parseDouble(scanner.nextLine());

        int flourFree = students/5;

        double sum = (students*(10*egg));
        sum +=((flour*students)-(flourFree*flour));

        sum+=((Math.ceil(students+0.2*students)*apron));

        if(budget>= sum){
            System.out.printf("Items purchased for %.2f$.",sum);
        }else{
            System.out.printf("%.2f$ more needed.",sum - budget);
        }

    }
}
