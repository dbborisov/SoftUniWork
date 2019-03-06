package DayFour.atHome;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
    TopNum(num);

    }

    static void TopNum(int num) {

        for (int i = 13; i <= num; i++) {
            String n = i + "";
            n.length();
            int sum = 0;
            for (int j = n.length() - 1; j >= 0; j--) {
                if (i > 10) {

                    sum += Integer.parseInt(n.charAt(j) + "");
                }
            }
            if (sum % 8 == 0) {
                if(i%2!=0) {

                    System.out.println(i);
                }
            }
            if (n.length() > 2) {
                if (n.indexOf(0) == n.indexOf(n.length() - 1)||n.indexOf(1)/2!=1) {
                    System.out.println( i);
                }

            }
        }

        }

    }

