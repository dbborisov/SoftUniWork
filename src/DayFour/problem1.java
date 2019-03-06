package DayFour;

import java.util.Scanner;

public class problem1 {

    public static void checkSign(int num){

        if(num<0){
            System.out.printf("The number %d is positive.",num);

        }else if(num == 0 ){

            System.out.printf("The number is zero.",num);
        } else{
            System.out.printf("The number %d is positive.",num);
        }



    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        checkSign(num);



    }
}
