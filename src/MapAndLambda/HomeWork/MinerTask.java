package MapAndLambda.HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";
        int num =0;

        Map<String,Integer> colect = new LinkedHashMap<>();

        while (!("stop").equals(text =scanner.nextLine())){
            num = Integer.parseInt(scanner.nextLine());

            if(!colect.containsKey(text)){
                colect.put(text,num);
            }else{
                colect.put(text,colect.get(text)+num);
            }
        }
        colect.forEach((e,e1) ->{
            System.out.println(String.format("%s -> %d",e,e1));

        });

    }
}
