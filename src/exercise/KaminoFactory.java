package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KaminoFactory {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String input = "";


        List<Integer> list = new ArrayList<>();
        int index = -1;
        int sum = Integer.MIN_VALUE;
        int position = 0;
        boolean biggSum = false;

        int p = 0;
        while (!"Clone them!".equals(input = reader.readLine())) {
            p++;
            List<Integer> curDNA = Arrays.stream(input.split("\\!+")).map(Integer::parseInt).collect(Collectors.toList());

            if (curDNA.size() == n) {
                int indexSiquance = -1;
                int sumSiquance = -1;
                int firtIndex = -1;

                int maxSum = 0;
                boolean inSiq = false;


                for (int i = 0; i < curDNA.size(); i++) {

                    if (curDNA.get(i) != 0) {
                        if (indexSiquance != -1) {
                            sumSiquance += curDNA.get(i);
                            inSiq = true;
                        } else {
                            indexSiquance = i;
                            sumSiquance = curDNA.get(i);
                        }

                    } else {
                        if (inSiq) {
                            firtIndex = indexSiquance;
                            maxSum = sumSiquance;
                        }
                            indexSiquance = -1;
                            sumSiquance = -1;


                    }

                }

                    if (index == firtIndex) {

                        if (list.stream().mapToInt(Integer::intValue).sum() < curDNA.stream().mapToInt(Integer::intValue).sum()) {
                            index = indexSiquance;
                            sum = maxSum;
                            position = p;
                            list = curDNA;
                            biggSum = true;


                        }
                    } else if (index < firtIndex) {
                        index = indexSiquance;
                        sum = maxSum;
                        position = p;
                        list = curDNA;
                    }


//               else if (sum < maxSum) {
//                    index = indexSiquance;
//                    sum = maxSum;
//                    position = p;
//                    list = curDNA;
//                }
            }

        }

            System.out.println(String.format("Best DNA sample %d with sum: %d.", position, sum));
            System.out.println(list.toString().replaceAll("[\\[\\]\\,]", ""));

    }

    }


