package SecondDay;

import java.util.Scanner;

public class Home_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String name = "";
        double radios = 0;
        int hight = 0;
        double bigkeg = 0;


        for (int i = 0; i < n; i++) {

            String someName = scanner.nextLine();
            double someRadios = Double.parseDouble(scanner.nextLine());
            int someHight = Integer.parseInt(scanner.nextLine());
            double sum = Math.PI * someRadios * someRadios * someHight;
            if (sum > bigkeg) {
                name = someName;
                radios = someRadios;
                bigkeg = sum;

            }


        }
        System.out.println(name);


    }

}
