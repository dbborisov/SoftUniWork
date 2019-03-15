package MapAndLambda.HomeWork;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text= String.join("",scanner.nextLine().split("\\s+"));

        Map<Character,Integer> countCar = new LinkedHashMap<>();

        for (int i = 0; i <text.length() ; i++) {

            char symbol = text.charAt(i);

            if (!countCar.containsKey(symbol)){
                countCar.put(symbol,1);

            }else{
                countCar.put(symbol,countCar.get(symbol)+1);
            }

        }
        countCar.entrySet().forEach(e ->{
            System.out.println(String.format("%s -> %d",e.getKey(),e.getValue()));
        });

    }
}
