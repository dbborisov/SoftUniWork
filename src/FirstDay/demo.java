package FirstDay;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = "%s from %s";
        String city  = scanner.nextLine();
        String name  = scanner.nextLine();


        System.out.printf(a,name,city);

    }
}
