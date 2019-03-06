package DayThree.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

@SuppressWarnings("ALL")
public class prob_07 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int countMax = 0;
        int indexMax = 0;


        for (int i = 0; i < numbers.length; i++) {
            int currentCount = 0;

            for (int j = i; j < numbers.length; j++) {

                if(numbers[i]==numbers[j]) {
                    currentCount++;
                    if (currentCount > countMax) {
                        countMax = currentCount;
                        indexMax = i;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i =0 ; i < countMax ; i++) {
            System.out.print(numbers[i+indexMax]+ " ");
            
        }


    }
}
