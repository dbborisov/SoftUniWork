//
//Problem 02. Activation Keys
//
//        Stamat got his games from the winter sale, but the keys he got to activate them do not work. He needs to make them in the correct format in order to get his games.
//        You will receive one line with the keys of the games, divided by "&". You will have to see if the keys are valid. A valid key contains only numbers, letters and is 16 or 25 symbols long.
//        In order to fix the keys, you first have to put dashes ('-') in them. If the key is 16 symbols long, you should divide it into four groups of four symbols. If the key is 25 symbols long, you have to divide it in five groups of five symbols. Then you have to make all the letters in the key uppercase. The last thing you have to do is to take every digit from the key, subtract it from nine (9), and replace it with the new digit you have.
//        In the end you have to print all the keys, joined by ", ".
//        Input
//        One line with all the keys, divided by "&".
//        Output
//        One line with all the valid keys, joined by ", ".
//        Examples
//        Input
//        t1kjZU764zIME6Dl9ryD0g1U8&-P4*(`Q>:x8\yE1{({X/Hoq!gR.&rg93bXgkmILW188m&KroGf1prUdxdA4ln&U3WH9kXPY0SncCfs
//        output
//        T8KJZ-U235Z-IME3D-L0RYD-9G8U1, RG06-BXGK-MILW-811M, KROG-F8PR-UDXD-A5LN, U6WH-0KXP-Y9SN-CCFS
//          comment
//        First you find the dividers '&' and then you take all the valid inputs (colored in yellow)
//          input
//        xPt8VYhUDalilWLvb6uMSGEEf&KWQ{R.@/HZCbbV++1o]V+oG@@fF^93&y6fT5EGFgZHqlFiS
//          output
//        XPT1V-YHUDA-LILWL-VB3UM-SGEEF, Y3FT-4EGF-GZHQ-LFIS

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
