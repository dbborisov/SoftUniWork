package excam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class prob_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());
        double budget = Double.parseDouble(scanner.nextLine());
        double startmoney = budget;


        double clothes = 50.00;
        double shoes = 35.00;
        double accessories = 20.50;

        int index = 0;

        List<String> newPrice = new ArrayList<>();

        while (budget >= 0 && index < list.size()) {
            List<String> comm = Arrays.stream(list.get(index).split("->")).collect(Collectors.toList());
            String type = comm.get(0);
            double price = Double.parseDouble(comm.get(1));
            switch (type){
                case "Clothes":
                    if(price<=clothes&&budget-price>=0){
                        budget-=price;
                        double curr = price+(price*0.4);
                        String a = String.format("%.2f",curr) ;
                        a=a.replace(",",".");
                        System.out.print(a + " ");
//                        double newCurr = Double.parseDouble(a);
                        newPrice.add(a);

                    }

                    break;
                case "Shoes":
                    if(price<=shoes&&budget-price>=0){
                        budget-=price;
                        double curr = price+(price*0.4);
                        String a = String.format("%.2f",curr) ;
                        a=a.replace(",",".");
                        System.out.print(a + " ");
//                        double newCurr = Double.parseDouble(a);
                        newPrice.add(a );
                    }

                    break;

                case "Accessories":
                    if(price<=accessories&&budget-price>=0){
                        budget-=price;
                        double curr = price+(price*0.4);
                        String a = String.format("%.2f",curr) ;
                        a=a.replace(",",".");

                        System.out.print(a+ " ");
//                        double newCurr = Double.parseDouble(a);
                        newPrice.add(a);

                    }

                    break;
            }



            index++;
//            System.out.println();

        }
        newPrice.stream().sorted();
        System.out.println();

        double total = newPrice.stream().mapToDouble(Double::parseDouble).sum();
        total+=budget;

        double profit = total - startmoney;

        if(total>150){
            System.out.printf("Profit: %.2f%n",profit);
            System.out.println("Hello, France!");

        }else{
            System.out.printf("Profit: %.2f%n",profit);
            System.out.println("Time to go.");
        }


    }
}
