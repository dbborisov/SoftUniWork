package excamePreparation;

import java.util.Scanner;

public class DungeonestDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int coint = 0;

        String[] rooms = scanner.nextLine().split("\\|");




        for (int i = 0; i <rooms.length ; i++) {
            String[] in = rooms[i].split("\\s+");
            if(in[0].equals("potion")){

                if(health<100){
                    int potion = Integer.parseInt(in[1]);
                    if(health+potion>100) {
                        System.out.printf("You healed for %s hp.%n", 100 - health);
                    }else{
                        System.out.printf("You healed for %s hp.%n", potion);
                    }
                    if(potion+health<100){
                        health+=potion;
                        System.out.printf("Current health: %d hp.%n",health);
                    }else{
                        System.out.println("Current health: 100 hp.");
                        health=100;
                    }

                }
            }else if(in[0].equals("chest")){

                coint+=Integer.parseInt(in[1]);
                System.out.printf("You found %s coins.%n",in[1]);

            }else{
                health-=Integer.parseInt(in[1]);
                if(health<=0){
                    System.out.printf("You died! Killed by %s.%n",in[0] );
                    System.out.println("Best room: "+ (i+1)  );
                    break;
                }else{
                    System.out.printf("You slayed %s.%n",in[0]);
                }

            }

        }
        if(health>0){
            System.out.printf("You've made it!%nCoins: %d%nHealth: %d",coint,health);
        }
    }
}
