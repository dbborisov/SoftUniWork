package Regex.HomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        int numLeft = 0;
        int numL = -1;
        String out = "";
        for (int i = in.length() - 1; i >= 0; i--) {

            int currNum = Integer.parseInt(in.charAt(i) + "");
            int sum = 0;


            sum = currNum * num;
            sum += numLeft;
            int sam = (sum + "").length();
            if ((sum + "").length() > 1) {
                out += (sum + "").substring(1);
                sum = sum - Integer.parseInt((sum + "").substring(1));
                numLeft = sum / 10;
                if (i == 0 && numLeft != 0) {
                    out += numLeft;
                }
            } else {
                out += sum + "";
                numLeft = 0;
            }


        }
        if ((out.charAt(out.length()-1) + "").equals("0")) {
            System.out.println(0);
        } else {
            List<String> a = Arrays.stream(out.split("")).collect(Collectors.toList());
            Collections.reverse(a);
            System.out.println(a.toString().replaceAll("[\\[\\], ]", ""));
        }
    }
}
