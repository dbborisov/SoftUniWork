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
        int Index = -1 ;
        int sum = Integer.MIN_VALUE;



        while (!"Clone them!".equals(input=reader.readLine())){

            List<Integer> curDNA = Arrays.stream(input.split("\\!+")).map(Integer::parseInt).collect(Collectors.toList());

            if(curDNA.size()==n){
                int indexSiquance = -1;
                int sumSiquance = -1;
                int firtIndex =-1;
                int maxSum = 0;
                boolean inSiq = false;


                for (int i = 0; i <curDNA.size() ; i++) {

                    if(curDNA.get(i)!=0){
                        if(indexSiquance!=-1){
                            sumSiquance+=curDNA.get(i);
                            inSiq=true;
                        }else{
                            indexSiquance=i;
                            sumSiquance=curDNA.get(i);
                        }

                    }else{
                        if(inSiq){
                            firtIndex =indexSiquance;
                            maxSum=sumSiquance;
                        }else{
                            indexSiquance = -1;
                            sum = -1;
                        }

                    }

                }
        }



        }

    }

}
