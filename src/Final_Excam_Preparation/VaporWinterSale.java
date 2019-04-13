package Final_Excam_Preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VaporWinterSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Double> gamePrice= new LinkedHashMap<>();
        Map<String,String> gameDLC= new LinkedHashMap<>();


        String[] in = scanner.nextLine().split(",\\s+");

        for (int i = 0; i <in.length ; i++) {


            if(in[i].contains("-")){
                String game = in[i].split("-")[0];
                double price = Double.parseDouble(in[i].split("-")[1]);

                gamePrice.putIfAbsent(game,price);

            }else{
                String dlc = in[i].split(":")[1];
                String game = in[i].split(":")[0];
                if(gamePrice.containsKey(game)){
                    gamePrice.put(game,gamePrice.get(game)*1.2);
                    gameDLC.put(game,dlc);
                }

            }

        }

        System.out.println();
    }
}
