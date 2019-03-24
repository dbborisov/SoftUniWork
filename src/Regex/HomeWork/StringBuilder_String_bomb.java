package Regex.HomeWork;

import java.util.Scanner;

public class StringBuilder_String_bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        String in = scanner.nextLine();
        out.append(in);
        int start=out.indexOf(">");
        int end=out.lastIndexOf(">");

//        String[] test = out.toString().split(">");

//        out.delete(start,out.indexOf());
        System.out.println(in);



    }
}
