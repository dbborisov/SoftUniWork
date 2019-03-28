package Basics;

import java.util.Scanner;

public class Football_Kit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tshirt = Double.parseDouble(scanner.nextLine());
        double shors = (tshirt*0.75);
        double socks =shors*0.20;
        double buttons = (tshirt+shors)*2;

        double sum = (tshirt+shors+socks+buttons)-(tshirt+shors+socks+buttons)*0.15;

        double sumThatHasReach = Double.parseDouble(scanner.nextLine());

        if(sum >= sumThatHasReach){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.println(String.format("His sum is %.2f lv.",sum));

        }else{
            System.out.println(String.format("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.",sumThatHasReach-sum));
        }
    }
}
