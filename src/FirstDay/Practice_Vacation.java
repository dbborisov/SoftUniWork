package FirstDay;

import java.util.Scanner;

public class Practice_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double total = 0;
        if(groupType.equals("Students")){
            if(day.equals("Friday")){
            total+=people*8.45;
            }else if(day.equals("Saturday")){
                total+=people*9.8;
            }else if(day.equals("Sunday")){
                total+=people*10.46;
            }
            if(people >= 30){
                total=total- total*0.15;
            }
        }else if (groupType.equals("Business")){
            if(day.equals("Friday")){
                total+=people*10.9;
            }else if(day.equals("Saturday")){
                total+=people*15.6;
            }else if(day.equals("Sunday")){
                total+=people*16;
            }
            if(people >= 100){
                double discount = total / people;
                discount = discount*10;
                total=total-discount;
            }

        }else if (groupType.equals("Regular")){
            if(day.equals("Friday")){
                total+=people*15;
            }else if(day.equals("Saturday")){
                total+=people*20;
            }else if(day.equals("Sunday")){
                total+=people*22.5;
            }
            if(people >= 10&& people<=20){
               total-=total*0.05;
            }

        }
        System.out.printf("Total price: %.2f",total);
    }
}
