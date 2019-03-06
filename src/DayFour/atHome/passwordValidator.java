package DayFour.atHome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class passwordValidator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String password = reader.readLine();

        System.out.println(isValidPass(password));


    }

    public static String isValidPass(String pass) {

        char[] characters = new char[pass.length()];
        for (int i = 0; i < pass.length(); i++) {
            characters[i] = pass.charAt(i);
        }
        boolean isLenght = isLenghtOk(characters);
        boolean have2Dig = isItHave2Digits(characters);
        boolean isLeterAndNums = isAllLeterAndNums(characters);

        String ansuer = "";
        if (!isLenght || !have2Dig || !isLeterAndNums) {

            if (!isLenght) {
                ansuer += "Password must be between 6 and 10 characters\n";
            }
            if (!isLeterAndNums) {
                ansuer += "Password must consist only of letters and digits\n";
            }
            if (!have2Dig) {
                ansuer += "Password must have at least 2 digits\n";

            }

        } else {
            ansuer += "Password is valid";
        }


        return ansuer;
    }

    static boolean isLenghtOk(char[] arr) {

        if (arr.length >= 6) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isItHave2Digits(char[] arr) {

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            char a = arr[i];
            if (a >= 48 && a <= 57) {
                counter++;

            }

        }
        if (counter >= 2) {
            return true;
        } else {
            return false;
        }

    }

    static boolean isAllLeterAndNums(char[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            char a = arr[i];
            if (a >= 97 && a <= 122 || a >= 65 && a <= 90||a>=48&&a<=57) {
                counter++;

            }

        }
        if (counter == arr.length) {
            return true;
        } else {
            return false;
        }
    }
}
