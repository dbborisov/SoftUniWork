package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> inNums = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        int[] bommb = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int index = 0;
        int bomb = bommb[0];
        int power = bommb[1];


        for (int i = index; i < inNums.size(); i++) {
            for (int c = 0; c < inNums.size(); c++) {
                if (inNums.get(c).equals(bomb + "")) {
                    index = c;
                    break;

                }
            }
            if (index != -1) {
                for (int j = 1; j <= power; j++) {
                    if (inNums.size() - 1 > index) {
                        inNums.remove(index + 1);
                    }
                }
                for (int j = 1; j <= power; j++) {
                    if (index > 0) {
                        inNums.remove(index - 1);
                        index -= 1;

                    }
//                System.out.println(inNums.toString());
                }
                inNums.remove(index);
            }

            index = -1;


        }
        int sum = 0;
        for (int i = 0; i < inNums.size(); i++) {
            sum += Integer.parseInt(inNums.get(i));

        }
        System.out.println(sum);

    }
}
