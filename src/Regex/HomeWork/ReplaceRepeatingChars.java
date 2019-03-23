package Regex.HomeWork;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
//        in=in.replaceAll("\\s+","");
        String out = "";
        int count = 0;

        for (int i = 0; i < in.length(); i++) {
            char cha = in.charAt(i);

            for (int j = i; j < in.length(); j++) {

                if (cha == in.charAt(j)) {
                    count++;

                } else {
                    out += cha;
                    in = in.substring(j);
                    count = 0;
                    i--;
                    break;
                }
            }

        }
        if (in.length() == 2) {
            if (in.charAt(0) == in.charAt(1)) {
                out += in.charAt(0);
            }
        } else {
            if (in.length() == 1) {
                out += in.charAt(0);
            }
        }
        System.out.println(out);

    }
}
