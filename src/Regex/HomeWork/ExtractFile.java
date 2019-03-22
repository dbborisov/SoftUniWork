package Regex.HomeWork;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String fileName = "";
        String extension = "";

        String out = "";
        int index = in.lastIndexOf("\\");
        int sexIndex = in.lastIndexOf(".");
//        out = in.substring(index+1);
//        String[] theName=out.split("\\.");
        fileName = in.substring(index + 1, sexIndex);
        extension = in.substring(sexIndex + 1);

        System.out.println(String.format("File name: %s\n" +
                "File extension: %s\n", fileName, extension));

    }
}
