package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class CardGame2 {

    static List<Integer> bigList(java.util.List a, List b) {
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

        List<Integer> f = new ArrayList<>();
        List<Integer> s= new ArrayList<>();
        int small = smallList(firstPlayar,secondPlayar).size();

        while (small>0) {
            for (int i = 0; i < small; i++) {
                if(firstPlayar.size()>secondPlayar.size()){
                    for (int j =secondPlayar.size()-1 ; j > firstPlayar.size()-1; j++) {
                        f.add(j);

                    }
                }else if(secondPlayar.size()>firstPlayar.size()){
                    for (int j =firstPlayar.size()-1 ; j > secondPlayar.size()-1; j++) {
                        f.add(j);

                    }
                }


                if (firstPlayar.get(i) > secondPlayar.get(i)) {
                    f.add(secondPlayar.get(i));
                    f.add(firstPlayar.get(i));
                } else if (secondPlayar.get(i) > firstPlayar.get(i)) {
                    s.add(firstPlayar.get(i));
                    s.add(secondPlayar.get(i));
                }
            }

//            firstPlayar.subList(0,4);
            firstPlayar=f;
            secondPlayar=s;
            f=new ArrayList<>();
            s=new ArrayList<>();
            small = smallList(firstPlayar,secondPlayar).size();
//            System.out.println(firstPlayar.toString()+" "+secondPlayar.toString()+"\n");
        }


        int sum =0;
        String winner = "";
        List <Integer> win = new ArrayList<>();
        if(firstPlayar.size()>secondPlayar.size()){
            winner = "First";
            win=firstPlayar;

        }else if (firstPlayar.size()<secondPlayar.size()){
            winner = "Second";
            win= secondPlayar;
        }

        for (int i = 0; i <win.size() ; i++) {
        sum += win.get(i);

    }
        System.out.printf("%s player wins! Sum: %d",winner,sum);
//        System.out.println(firstPlayar.toString()+"\n"+secondPlayar.toString());

    }


}

