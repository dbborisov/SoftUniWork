package Regex.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String in = "";

        double total =0;

        Pattern pattern = Pattern.compile("^>>(?<product>[^<>]+)<<(?<price>[+-]*[\\d+][.\\d]*)(?:!)(?<quantity>[+-]*\\d+)");
        List<String> out = new ArrayList<>();



        while (!"Purchase".equals(in=scanner.nextLine())){
            Matcher matcher = pattern.matcher(in);


            if(matcher.find()){


                out.add(matcher.group("product"));
                total+=Double.parseDouble(matcher.group("price"))*Double.parseDouble(matcher.group("quantity"));

            }
        }


        System.out.println("Bought furniture:");
        out.stream().forEach(e->{
            System.out.println(e);
        });
        System.out.println(String.format("Total money spend: %.2f",total));
    }
}
