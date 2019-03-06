package DayFour.atHome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class prob01 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numOne = Integer.parseInt(reader.readLine());
        int numSecond = Integer.parseInt(reader.readLine());
        int numThird = Integer.parseInt(reader.readLine());
        int big = bigNum(numOne,numSecond,numThird);
        System.out.println(big);


    }

    static int bigNum(int numFirst,int numSecond, int numThird){
        int min=Math.min(numFirst,numSecond);
        min = Math.min(min,numThird);
        return min;



    }
}
