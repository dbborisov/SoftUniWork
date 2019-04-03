package Final_Excam_Preparation;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VaporWinterSale_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] in = scanner.nextLine().split(", ");
        Map<String,Double> gamePrice = new LinkedHashMap<>();
        Map<String,String> gameDLC = new LinkedHashMap<>();

        for (String s : in) {

            if(s.contains("-")){
                String name = s.substring(0,s.indexOf('-'));
                double price = Double.parseDouble(s.substring(s.indexOf('-')+1));

                if (!gamePrice.containsValue(name)){
                    gamePrice.put(name,price);
                }

            }else{

                String name = s.substring(0,s.indexOf(':'));
                String dlc = s.substring(s.indexOf(':')+1);

                if(gamePrice.containsKey(name)){
                    gameDLC.put(name,dlc);
                    double n = gamePrice.get(name);
                    n+=n*0.2;
                    gamePrice.put(name,n);
                }
            }
        }

        for (String s : gamePrice.keySet()) {
            if(gameDLC.containsKey(s)){
                gamePrice.put(s,gamePrice.get(s)/2);
            }else{
                double n  =gamePrice.get(s);
                n-=n*0.2;
                gamePrice.put(s,n);
            }
        }
        gamePrice.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(e->{
            if(gameDLC.containsKey(e.getKey())){
                System.out.println(String.format("%s - %s - %.2f",e.getKey(),gameDLC.get(e.getKey()),e.getValue()));

            }
        });

        gamePrice.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).forEach(e->{
            if(!gameDLC.containsKey(e.getKey())){
                System.out.println(String.format("%s - %.2f",e.getKey(),e.getValue()));

            }
        });


//        System.out.println(gameDLC+"\n"+gamePrice);


    }
}
