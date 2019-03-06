package daySix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        LocalDate date = LocalDate.of(2018,5,5);
//        System.out.println(date + " " + LocalDateTime.now().toLocalDate());
//
//        Random random = new Random();
//
//        random.ints(100);
//
//
//        System.out.println(random);


//           List<String> words=  Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
//
//
//           Random random = new Random();
//
//
//           while (!words.isEmpty()){
//               int randomIndex = random.nextInt(words.size());
//
//               String word = words.get(randomIndex);
//               System.out.println(word);
//               words.remove(randomIndex);



        Dice dice = new Dice();
        System.out.println(dice.getSides());
        dice.setSides(2);
        System.out.println(dice.getSides());
        dice.roll();



           }

    }

