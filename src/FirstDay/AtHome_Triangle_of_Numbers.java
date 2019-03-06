package FirstDay;

import java.util.Scanner;

public class AtHome_Triangle_of_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <=num ; i++) {
            for (int j = i; j >0 ; j--) {
                System.out.print(i+" ");

            }
            System.out.println();
        }

    }
}
