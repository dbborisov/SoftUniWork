package Final_Excam_Preparation;

import java.util.Scanner;

public class Deciphering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String crypt = scanner.nextLine();

        String[] substring = scanner.nextLine().split("\\s+");
        String decrypt = "";

        for (int i = 0; i <crypt.length() ; i++) {
            if(crypt.charAt(i)=='a' || crypt.charAt(i)=='b' ||crypt.charAt(i)=='c'  ) {
                System.out.println("This is not the book you are looking for.");
                return;
            }
            decrypt += (char) (crypt.charAt(i) - 3);
        }
        decrypt=decrypt.replaceAll(substring[0],substring[1]);
        System.out.println(decrypt);
    }
}
