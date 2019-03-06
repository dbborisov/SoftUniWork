package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppendArrays1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String list = reader.readLine();
        String curent ="";

//        list=list.replaceAll(" ","-");
        List <String> listArr = Arrays.stream(list.split("\\|")).collect(Collectors.toList());

        for (int i = listArr.size()-1; i >=0 ; i--) {

            List<String> str = Arrays.stream(listArr.get(i).split("\\s+")).collect(Collectors.toList());
            while (str.contains("")) {
                str.remove("");
//                System.out.println(str.toString());
            }
            curent=str.toString().replaceAll("[\\[\\]]","").replaceAll(",","").replaceAll("  "," ");
            listArr.set(i,curent);
            curent="";
        }



        Collections.reverse(listArr);
//        System.out.println(String.join( " ",listArr));
        System.out.println(listArr.toString().replaceAll("[\\[\\]]","").replaceAll(",",""));
    }
}
