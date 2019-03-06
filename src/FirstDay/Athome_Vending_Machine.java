package FirstDay;


import java.util.Scanner;

public class Athome_Vending_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coins = "";
        double money = 0;
        coins = scanner.nextLine();
        double moneyIn = 0;
        while (!coins.equals("Start")) {
            moneyIn = Double.parseDouble(coins);
            if (moneyIn == 0.1) {
                money += moneyIn;
            } else if (moneyIn == 0.2) {
                money += moneyIn;
            } else if (moneyIn == 0.5) {
                money += moneyIn;
            } else if (moneyIn == 1) {
                money += moneyIn;
            } else if (moneyIn == 2) {

            } else {
                System.out.printf("Cannot accept %.2f%n", moneyIn);
            }
            coins = scanner.nextLine();
        }
        coins = scanner.nextLine();
        while (!coins.equals("End")) {

            if (coins.equals("Nuts")) {
                if (money - 2.0 >= 0) {
                    money -= 2.0;
                    System.out.printf("Purchased %s%n", coins);
                } else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (coins.equals("Water")) {
                if (money - 0.7 >= 0) {
                    money -=  0.7;
                    System.out.printf("Purchased %s%n", coins);
                } else {
                    System.out.println("Sorry, not enough money");
                }


            } else if (coins.equals("Crisps")) {
                if (money - 1.5 >= 0) {
                    money -= 1.5;
                    System.out.printf("Purchased %s%n", coins);
                } else {
                    System.out.println("Sorry, not enough money");
                }


            } else if (coins.equals("Soda")) {
                if (money - 0.8 >= 0) {
                    money -=  0.8;
                    System.out.printf("Purchased %s%n", coins);
                } else {
                    System.out.println("Sorry, not enough money");
                }


            } else if (coins.equals("Coke")) {
                if (money - 1.0 >= 0) {
                    money -=  1.0;
                    System.out.printf("Purchased %s%n", coins);
                } else {
                    System.out.println("Sorry, not enough money");

                }


            }else{
                System.out.println("Invalid product");
            }
            coins = scanner.nextLine();

        }
        System.out.printf("Change: %.2f", money);


    }
}
