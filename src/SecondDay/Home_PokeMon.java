package SecondDay;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Home_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int b = (n *50)/ 100;
        int count = 0;

        //m-n until n < m

        while (n >= m) {

            count++;

            n -= m;

            if (n == b) {
                if (y>0) {
                    n = n / y;

                }

            }



        }
        System.out.println(n);
        System.out.println(count);


    }
}
