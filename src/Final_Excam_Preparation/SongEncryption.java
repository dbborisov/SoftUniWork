package Final_Excam_Preparation;

import java.util.Scanner;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = "";


        while (!"end".equals(in = scanner.nextLine())) {

            boolean mach = in.matches("(?<valid>^[A-Z][ a-z']+ *[a-z']* *: *[A-Z]+ *[A-Z ]+)$");

            if (mach) {
                String encrypt = "";
                int key = in.indexOf(':');

                for (int i = 0; i < in.length(); i++) {

                    if (in.charAt(i) != '\'' && in.charAt(i) != ' ' && in.charAt(i) != ':') {
                        int control = (in.charAt(i) + key);
                        if (control - key >= 65 && (control >= 65 && control <= 90) || (control - key >= 97 && control >= 97 && control <= 122)) {
                            encrypt += (char) (control);
                        } else {
                            if (control - key < 91) {
                                encrypt += (char) (((control) % 90) + 64);

                            } else if (control - key < 123) {
                                encrypt += (char) (((control) % 122) + 96);

                            }
                        }

                    } else {
                        encrypt += in.charAt(i);
                    }

                }
                encrypt = encrypt.replace(':', '@');
                System.out.println("Successful encryption: " + encrypt);
            } else {
                System.out.println("Invalid input!");
            }


        }
    }
}
