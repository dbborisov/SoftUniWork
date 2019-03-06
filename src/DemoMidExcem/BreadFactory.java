package DemoMidExcem;

import java.util.Scanner;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] order = scanner.nextLine().split("\\|");

        int coins = 100;
        int helth = 100;
        String[] command ;
        boolean isBancrut = false;
        for (int i = 0; i <order.length ; i++) {
            command = order[i].split("-");

            if(command[0].equals("rest")){
                int energy = Integer.parseInt(command[1]);
                if(helth+energy<=100){
                    helth=energy+helth;
                    System.out.printf("You gained %d energy.%n",energy);
                    System.out.printf("Current energy: %d.%n",helth);

                }else {
                    System.out.printf("You gained %d energy.%n",100-helth);
                    helth=100;
                    System.out.printf("Current energy: %d.%n",helth);
                }



            }else if (command[0].equals("order")){


                if(helth-30>=0){
                    helth-=30;
                    coins+=Integer.parseInt(command[1]);
                    System.out.println("You earned "+command[1]+" coins.");
                }else{

                   helth+=50;
                   System.out.println("You had to rest!");
//                   continue;
                }


            }else{
                int spend = Integer.parseInt(command[1]);
                if(coins-spend>0){
                    System.out.printf("You bought %s.%n",command[0]);
                    coins-=spend;
                }else{
                    System.out.printf("Closed! Cannot afford %s.%n",command[0]);
                    isBancrut=true;
                    break;
                }

            }

        }


        if(!isBancrut){
            System.out.printf("Day completed!%nCoins: %d%nEnergy: %d",coins,helth);
        }

    }
}
