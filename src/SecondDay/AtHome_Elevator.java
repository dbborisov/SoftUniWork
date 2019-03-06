package SecondDay;

import java.util.Scanner;

public class AtHome_Elevator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int max = n / p;

        if ( n/p != 0 && n % p == 0) {

            System.out.println(max);

        }else if (max % p !=0){
            System.out.println(max+1);
        }else{
            System.out.println(1);
        }
    }
}
