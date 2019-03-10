package excam;

import java.util.Scanner;

public class Prob_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int daystrip = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int group = Integer.parseInt(scanner.nextLine());
        double fuelPerKM = Double.parseDouble(scanner.nextLine());
        double foodPerPerson = Double.parseDouble(scanner.nextLine());
        double hotelPerPerson = Double.parseDouble(scanner.nextLine());




        double foodExp = foodPerPerson*group*daystrip;

        double hotelExp = hotelPerPerson*daystrip*group;
        if(group>10){

            hotelExp =(hotelPerPerson*daystrip*group) - 0.25*(hotelPerPerson*daystrip*group);

        }

        double fuletotal= 0;
        double dayExpence = (foodExp+hotelExp) / daystrip;

        double total = foodExp+hotelExp;

        for (int i = 1; i <=daystrip ; i++) {
            if(budget>=total) {
                double fuelDay = Double.parseDouble(scanner.nextLine());

                fuletotal = fuelDay * fuelPerKM;
                total += fuletotal;
                if (i % 3 == 0 || i % 5 == 0) {

                    total += 0.4 * (total);


                }
                if (i % 7 == 0) {
                    total -= total / group;
                }
            }else{
                break;
            }







        }




if(budget>total) {
    System.out.println(String.format("You have reached the destination. You have %.2f$ budget left.", budget - total));
}else{
    System.out.println(String.format("Not enough money to continue the trip. You need %.2f$ more.",  total - budget));
}
    }
}
