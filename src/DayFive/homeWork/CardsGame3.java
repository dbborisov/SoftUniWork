package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class CardsGame3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> firstP = Arrays.stream(reader.readLine().split("[\\s+]")).collect(Collectors.toList());
        List<String> secondP = Arrays.stream(reader.readLine().split("[\\s+]")).collect(Collectors.toList());


//        boolean isFirstWin = false;
        boolean isFirstBiger =  firstP.size() > secondP.size();

        while (firstP.size() > 0 && secondP.size() > 0) {
//            List<String> win = new ArrayList<>();
            int counter = !isFirstBiger ? firstP.size() : secondP.size();

                for (int i = 0; i < counter; i++) {
                    if (Integer.parseInt(firstP.get(0)) > Integer.parseInt(secondP.get(0))) {

                        String swap = firstP.get(0);
                        firstP.remove(0);
                        firstP.add(secondP.get(0));
                        secondP.remove(0);
                        firstP.add(swap);

                }else if(Integer.parseInt(firstP.get(0)) < Integer.parseInt(secondP.get(0)) ){
                        String swap = secondP.get(0);
                        secondP.remove(0);
                        secondP.add(firstP.get(0));
                        firstP.remove(0);
                        secondP.add(swap);


                    }else{
                        firstP.remove(0);
                        secondP.remove(0);

                    }

            }
            isFirstBiger = firstP.size() > secondP.size();
        }
        if(isFirstBiger){
            System.out.printf("First player wins! Sum: %d",firstP.stream().mapToInt(Integer::parseInt).sum());

        }else{
            System.out.printf("Second player wins! Sum: %d",secondP.stream().mapToInt(Integer::parseInt).sum());
        }

    }
}
