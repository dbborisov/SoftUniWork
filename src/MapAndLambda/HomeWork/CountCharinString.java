package MapAndLambda.HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = String.join("",scanner.nextLine().split("\\s+"));

        Map<Character,Integer> countChars = new LinkedHashMap<>();//We use that type of Map because we need to save the order of keys by input.

        for (int i = 0; i <text.length() ; i++) {
            char symbol = text.charAt(i);

            if(!countChars.containsKey(symbol)){
                countChars.put(symbol,1);

            }else{
                countChars.put(symbol,countChars.get(symbol)+1);
            }

        }
        countChars.entrySet().forEach(e->{
            System.out.println(String.format("%s -> %d",e.getKey(),e.getValue()));
        });
    }
}
