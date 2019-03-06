package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class CardsGame {
    static List<Integer> bigList(List a, List b) {
        if (a.size() > b.size()) {
            return a;
        } else {
            return b;
        }
    }

    static List<Integer> smallList(List a, List b) {
        if (a.size() < b.size()) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //First hand
        List<Integer> firstPlayar = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        //Second hand
        List<Integer> secondPlayar = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> big = bigList(firstPlayar, secondPlayar);
        List<Integer> smal = smallList(firstPlayar, secondPlayar);

       while (smallList(firstPlayar,secondPlayar).size()>1){
           if(firstPlayar.get(0) == secondPlayar.get(0) ){
               firstPlayar.remove(0);
               secondPlayar.remove(0);

           }else if(firstPlayar.get(0)>secondPlayar.get(0)){
               int f = firstPlayar.get(0);
               int s = secondPlayar.get(0);
               firstPlayar.remove(0);
               secondPlayar.remove(0);
               firstPlayar.add(s);
               firstPlayar.add(f);
           }else if(firstPlayar.get(0)<secondPlayar.get(0)){
               int f = firstPlayar.get(0);
               int s = secondPlayar.get(0);
               firstPlayar.remove(0);
               secondPlayar.remove(0);
               secondPlayar.add(f);
               secondPlayar.add(s);
           }
//           System.out.println(firstPlayar.toString()+"\n"+secondPlayar.toString());


       }

       int sum =0;
       String winner = "";
       List<Integer> win = new ArrayList<>();
       if(firstPlayar.size()>secondPlayar.size()){
           winner = "First";
           win = firstPlayar;
       }else if (firstPlayar.size()<secondPlayar.size()){
           winner = "Second";
           win = secondPlayar;
       }
       if(winner.equals("First")){
           if(firstPlayar.get(0)!= secondPlayar.get(0)) {
               firstPlayar.add(secondPlayar.get(0));
              firstPlayar.add( firstPlayar.get(0));
              firstPlayar.remove(0);
           }else {
               firstPlayar.remove(0);
           }
       }else{
           if(firstPlayar.get(0)!= secondPlayar.get(0)){
               secondPlayar.add(firstPlayar.get(0));
               secondPlayar.add( secondPlayar.get(0));
               secondPlayar.remove(0);
           }else{
               secondPlayar.remove(0);
           }
       }
        for (int i = 0; i <win.size() ; i++) {
            sum += win.get(i);

        }
        System.out.printf("%s player wins! Sum: %d",winner,sum);
    }
}
