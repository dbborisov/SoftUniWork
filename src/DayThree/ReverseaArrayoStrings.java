package DayThree;

import java.util.Scanner;

public class ReverseaArrayoStrings {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i < words.length / 2; i++) {

            String a = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = a;


        }
        System.out.println(String.join(" ",words));
        //iter - forech
    }
}
