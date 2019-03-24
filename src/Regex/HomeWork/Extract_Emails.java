
package Regex.HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        Pattern regex =  Pattern.compile("\\s[0-9A-Za-z][\\w\\.-]*@[A-Za-z-]+(\\.[A-Za-z]+)+");
        Matcher match = regex.matcher(in);
        while ((match.find())){
            System.out.println(match.group(0).trim());
        }


    }
}
