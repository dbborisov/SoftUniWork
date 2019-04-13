
package Final_Excam_Preparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryption_ {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(?<name>^[A-Z][a-z]+\\s*[a-z][']*[a-z]*):\\s*(?<song>[A-Z\\s]*)$");

        String in = "";

        int key = 0;


        while (!"end".equals(in = scanner.nextLine())) {
            String crypted = "";
            Matcher matcher = pattern.matcher(in);

            if (matcher.find()) {
                key = matcher.group("name").length();
                for (int i = 0; i < in.length(); i++) {
                    char theChar = in.charAt(i);
                    if (theChar == ':') {
                        crypted += '@';
                        continue;
                    }
                    if (theChar == ' ' || theChar == '\'') {
                        crypted += theChar;
                        continue;
                    }
                    if ((theChar >= 'a' && theChar + key >= 'a' && theChar + key <= 'z') || (theChar >= 'A' && theChar + key >= 'A' && theChar + key <= 'Z')) {
                        crypted += (char) (theChar + key);

                    } else {
                        if (theChar < 91) {
                            crypted += (char) (((theChar + key) % 90) + 64);

                        } else if (theChar < 123) {
                            crypted += (char) (((theChar + key) % 122) + 96);

                        }

                    }

                }
                System.out.println("Successful encryption: " + crypted);


            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
