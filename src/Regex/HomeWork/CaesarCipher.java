package Regex.HomeWork;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();

        System.out.println(getCrypted(in));

    }

    private static String getCrypted(String in) {
        String crypt = "";

        for (int i = 0; i < in.length(); i++) {

            crypt += (char) (in.charAt(i) + 3) + "";
        }


        return crypt;
    }
}
