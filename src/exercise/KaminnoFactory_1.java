package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KaminnoFactory_1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String readin = "";


        List<Integer> bestDNA =new ArrayList<>();
        int cout  = 0;
        int bestLength = 0;
        int bestCount=0;
        int bestIndex = 0;
        int bestSum=Integer.MIN_VALUE;



        while (!"Clone them!".equals(readin=scanner.nextLine())){

            cout++;

            List<Integer> testDNA = Arrays.stream(readin.split("!+")).map(Integer::parseInt).collect(Collectors.toList());
            int testSum = testDNA.stream().mapToInt(Integer::intValue).sum();
            String test = readin.replaceAll("!+","");
            List<String> testDNALength = Arrays.stream(test.split("0")).collect(Collectors.toList());

            int testLength=0;
            String bestLocalDNA = "";

            for (int i = 0; i <testDNALength.size() ; i++) {
                if(testLength<testDNALength.get(i).length()) {
                    testLength = testDNALength.get(i).length();
                    bestLocalDNA = testDNALength.get(i);
                }
            }

            int testIndex = test.indexOf(bestLocalDNA);

            if(testLength>bestLength){
                bestLength=testLength;
                bestDNA=testDNA;
                bestCount = cout;
                bestIndex=testIndex;
                bestSum=testSum;

            }else if(testLength==bestLength&&(bestIndex>testIndex||bestSum<testSum)){

                bestLength=testLength;
                bestDNA=testDNA;
                bestCount = cout;
                bestIndex=testIndex;
                bestSum=testSum;
            }


//            System.out.println();
        }

        System.out.println(String.format("Best DNA sample %d with sum: %d.",bestCount,bestSum));
        System.out.println(bestDNA.toString().replaceAll("[\\[\\],]",""));


    }
}
