package DemoMidExcem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in;
        List<Integer> best = new ArrayList<>();

        double totalQ = Integer.MIN_VALUE;
        double avergQ = Integer.MIN_VALUE;
        int size = Integer.MAX_VALUE;

        while (!"Bake It!".equals(in = scanner.nextLine())) {

            List<Integer> test = Arrays.stream(in.split("#+")).map(Integer::parseInt).collect(Collectors.toList());
            int sum = test.stream().mapToInt(a -> a).sum();
            if (totalQ == sum) {
                if (avergQ <= (sum*1.0) / test.size()) {

                    if(avergQ<(sum*1.0) / test.size()){
                        best = test;
                        totalQ = sum;
                        avergQ = totalQ / (test.size()*1.0);
                        size = test.size();

                    }else if (avergQ == (sum*1.0) / test.size()) {
                        if(size>test.size()) {
                            best = test;
                            totalQ = sum;
                            avergQ = totalQ / (test.size()*1.0);
                            size = test.size();
                        }

                    }

                }
            }else if(totalQ < sum){
                best = test;
                totalQ = sum;
                avergQ = totalQ / (test.size()*1.0);
                size = test.size();
            }

        }

        System.out.println("Best Batch quality: " + (int) totalQ);
        System.out.println(best.toString().replaceAll("[\\]\\[,]", ""));


    }


}

