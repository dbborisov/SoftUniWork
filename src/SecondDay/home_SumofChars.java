package SecondDay;

import java.util.Scanner;

public class home_SumofChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int lines = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int total = 0;
        while (count<lines){

            String in = scanner.nextLine();
            total +=in.valueOf(in).charAt(0) ;
            count++;

        }
        System.out.println("The sum equals: "+total);

    }
}
