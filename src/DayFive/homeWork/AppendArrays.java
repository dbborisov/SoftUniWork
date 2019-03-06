package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppendArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] in = reader.readLine().split("\\|");
        List<String> out = new ArrayList<>();

        for (int i = in.length-1; i >=0 ; i--) {
            String a=in[i];
            while (a.contains("  ")) {
                a = a.replaceAll("  ", " ");
            }
            while (a.charAt(0)==' '){
                a=a.substring(1);
            }
            while (a.charAt(a.length()-1)==' '){
                a = a.substring(0,a.length()-1);
            }
            int t =a.indexOf("");

            out.add(a);

        }
        System.out.println(out.toString().replaceAll("[\\[\\],]",""));
        

    
    }

}
