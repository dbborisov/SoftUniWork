package DayFive.Bitwise_Operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo {
    public static void main(String[] args) throws IOException {


//        int a = 5;
//        int c = 7;
//        String b = "a";
//
//        System.out.println(a^c);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int bitToFinde = Integer.parseInt(reader.readLine());

        String  convert = Integer.toBinaryString(number)+"";
        System.out.println(convert);
        System.out.println(convert.replaceAll("[1+]","").length());

        System.out.println(bitToFinde^number);


    }
}
