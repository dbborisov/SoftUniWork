package excamePreparation;

import java.util.Scanner;

public class ChristmasSpirit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int quantity = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int budget = 0;
        int spirit = 0;


        for (int i = 1; i <= days ; i++) {
            if(i%11==0){

                quantity+=2;
            }


            if(i%2==0){
                budget+=quantity*2;
                spirit+=5;
            }if(i%3==0){
                budget+=quantity*5;
                budget+=quantity*3;
                spirit+=13;
            }if(i%5==0){
                budget+=quantity*15;
                spirit+=17;
                if(i%3==0){
                    spirit+=30;
                }
            }if(i%10==0){
                spirit-=20;
                budget+=5+3+15;


            }





        }
        if(days%10==0){
            spirit-=30;
        }

        System.out.printf("Total cost: %d%n",budget);
        System.out.printf("Total spirit: %d",spirit);


    }
}
