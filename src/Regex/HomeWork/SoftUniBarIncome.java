package Regex.HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = "";
        double total = 0;

        Pattern pattern = Pattern.compile("\\%(?<persone>[A-Z][a-z]+)\\%(?:[^|$%.])*<(?<product>[^<>]+)>(?:[A-Za-z]*)(?:[^|$%.])*\\|(?<quantity>[\\d]+)(?:[^|$%.])*\\|(?:[a-z]*)(?<price>[\\d]+[\\.\\d]*)\\$");


        while (!"end of shift".equals(in=scanner.nextLine())){
            Matcher matcher =pattern.matcher(in);
            if(matcher.find()){
                String person = matcher.group("persone");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                total+=price*quantity;

                System.out.println(String.format("%s: %s - %.2f",person,product,price*quantity));


            }

        }
        System.out.println(String.format("Total income: %.2f",total));


    }
}
