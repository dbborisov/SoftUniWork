package DayFour.atHome;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob02 {
    public static void main(String[] args)throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String read = reader.readLine().toLowerCase();
        int num = isVowels(read);
        System.out.println(num);

// a, e, i, o, u


    }
    static int isVowels(String in){
        int counter = 0;
        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }

        }



        return counter;

    }


}
