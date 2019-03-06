package DayFour.atHome;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        while (!"END".equals(a) ){
            isPolidrom(a);
            a=scanner.nextLine();


        }
    }

    static void isPolidrom(String a) {
        int count = 0;
        for (int i = 0, j = a.length() - 1; i < a.length(); i++, j--) {
            if (a.charAt(i) == a.charAt(j)) {
                count++;
            }
        }
        if(count==a.length()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
