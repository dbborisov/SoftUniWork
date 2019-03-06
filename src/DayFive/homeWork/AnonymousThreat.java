package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class AnonymousThreat {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> inputArray = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

//        String in="";
        List<String> in = new ArrayList<>();
        in= Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        while (!"3:1".equals(in.get(0))){

            if(in.get(0).contains("merge")){
//•	merge {startIndex} {endIndex}

               inputArray= merger(inputArray,Integer.parseInt(in.get(1)),Integer.parseInt(in.get(2)));


            }else if (in.get(0).contains("divide")){
//•	divide {index} {partitions}
                inputArray= divider(inputArray,Integer.parseInt(in.get(1)),Integer.parseInt(in.get(2)));

            }

            in= Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        }
        System.out.println(inputArray.toString().replaceAll("[\\[\\],]",""));

    }
    static List<String> divider(List<String> str,int startIndex,int partition){
        List<String> dividerr = new ArrayList<>();
        String inArr = str.get(startIndex);
        String outArr= "";
         int part=inArr.length();
         if(part%partition==0){
             for (int i = 0; i <part ; i++) {

                 if((i)%(part/partition)==0&&i!=0){
                     outArr+= " ";

                 }

                 outArr+=inArr.charAt(i);

             }
//             dividerr= Arrays.stream(outArr.split(" ")).collect(Collectors.toList());
             for (int i = 0; i <startIndex ; i++) {
                 dividerr.add(str.get(i));

             }
             List<String> dev = Arrays.stream(outArr.split("\\s+")).collect(Collectors.toList());
             for (int i = 0; i <dev.size() ; i++) {
                 dividerr.add(dev.get(i));

             }
             if(str.size()-1<startIndex){
                 for (int i = startIndex+1; i < str.size(); i++) {
                     dividerr.add(str.get(i));

                 }
             }

         }


        return dividerr;
    }

    static List<String>merger(List<String> str,int startIndex,int endIndex){
        List<String> merger = new ArrayList<>();
        String arrayLiketext ="";

        if(endIndex<str.size()) {
            for (int i = startIndex; i <= endIndex; i++) {
                arrayLiketext += str.get(i);

            }
            for (int i = 0; i < startIndex; i++) {
                merger.add(str.get(i));

            }
            merger.add(arrayLiketext);
            for (int i = endIndex+1; i < str.size(); i++) {
                merger.add(str.get(i));

            }
        }else if ( str.size()>2){
            for (int i = startIndex; i < str.size(); i++) {
                arrayLiketext += str.get(i);

            }
            for (int i = 0; i < startIndex; i++) {
                merger.add(str.get(i));

            }
            merger.add(arrayLiketext);


        }else{
            for (int i = 0; i < str.size(); i++) {
                arrayLiketext += str.get(i);

            }
            merger.add(arrayLiketext);
        }


        return merger;
    }
}
