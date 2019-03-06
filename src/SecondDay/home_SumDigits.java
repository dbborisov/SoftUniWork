package SecondDay;

import java.util.Scanner;

public class home_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum=0 ;
        for (int i = 0; i <input.length() ; i++) {
            char charecter  = input.charAt(i);
            int num = Integer.parseInt(charecter+"");
            sum+=num;
        }
        System.out.println(sum);
    }
}
