package Basics;

import java.util.Scanner;

public class TripToCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ticketGo = Double.parseDouble(scanner.nextLine());
        double ticketBack = Double.parseDouble(scanner.nextLine());
        double socerTicket = Double.parseDouble(scanner.nextLine());
        double numSocer = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double sum = (ticketBack+ticketGo)*6;
        sum = sum - (sum*(discount/100));
        sum +=(socerTicket*numSocer)*6;
        System.out.println(String.format("Total sum: %.2f lv.",sum));
        System.out.println(String.format("Each friend has to pay %.2f lv.",sum/6));
    }
}
