package DayFour.atHome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class characters {
    public static void main(String[] args)throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        char startChar = scanner.readLine().charAt(0);
        char endChar = scanner.readLine().charAt(0);

        System.out.println(charRange(startChar,endChar));


    }

    private static String charRange(char startChar, char endChar) {
        String charSet = "";
        if(startChar<endChar) {
            for (int i = startChar + 1; i < endChar; i++) {

                charSet += (char) i + " ";
            }
        }else{
            for (int i = endChar+1; i <startChar ; i++) {
                charSet += (char) i + " ";
            }
        }
        return charSet;
    }
}
