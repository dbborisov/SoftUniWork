package Final_Excam_Preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VaporWinterSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Double> gamePrice= new LinkedHashMap<>();
        Map<String,String> gameDLC= new LinkedHashMap<>();


        String[] in = scanner.nextLine().split(", ");

        for (int i = 0; i <in.length ; i++) {


            if(in[i].contains("-")){
                String game = in[i].split("-")[0];
                double price = Double.parseDouble(in[i].split("-")[1]);

                gamePrice.put(game,price);

            }else{
                String dlc = in[i].split(":")[1];
                String game = in[i].split(":")[0];
                if(gamePrice.containsKey(game)){
                    gamePrice.put(game,gamePrice.get(game)+((gamePrice.get(game)*0.2)));
                    gameDLC.put(game,dlc);
                }

            }

        }
       gamePrice.entrySet().forEach(e->{
           if(gameDLC.containsKey(e.getKey())){
              gamePrice.put(e.getKey(), gamePrice.get(e.getKey())/2);
           }else{
               gamePrice.put(e.getKey(), gamePrice.get(e.getKey())*0.8);
           }
       });

        gamePrice.entrySet().stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue())).forEach(e->{
            if(gameDLC.containsKey(e.getKey())){
                System.out.println(String.format("%s - %s - %.2f",e.getKey(),gameDLC.get(e.getKey()),e.getValue()));
            }
        });
        gamePrice.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).forEach(e->{
            if(!gameDLC.containsKey(e.getKey())){
                System.out.println(String.format("%s - %.2f",e.getKey(),e.getValue()));

            }
        });

    }
}
