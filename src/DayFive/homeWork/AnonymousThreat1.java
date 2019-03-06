package DayFive.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	merge {startIndex} {endIndex}
//•	divide {index} {partitions}

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String in ="";

        while (!"3:1".equals(in=scanner.nextLine())) {
        String[] data = in.split("\\s+");
        String command= data[0];


            switch (command){
                case"merge":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    startIndex=validateIndex(startIndex,elements.size());
                    endIndex=validateIndex(endIndex,elements.size());
                    String concatElements =
                            String.join("",elements.subList(startIndex,endIndex + 1));
                    elements.subList(startIndex,endIndex + 1).clear();
                    elements.add(startIndex,concatElements);

                    break;
                case "divide":
                    int index= Integer.parseInt(data[1]);
                    int partitions= Integer.parseInt(data[2]);

                    List<String> result = dividerEqually(elements.get(index),partitions);
                    elements.remove(index);
                    elements.addAll(index,result);



                    break;

            }




        }
        System.out.println(String.join(" ",elements));
//        System.out.println(elements.toString().replaceAll("[\\[\\],]",""));
    }

    private static List<String> dividerEqually(String element, int partitions) {

        int part = element.length()/ partitions;
        ArrayList<String> result = new ArrayList<>();

        while (element.length()>=part){
            result.add(element.substring(0,part));
            element= element.substring(part);

        }
        if(result.size()==partitions){
         return result;
        }else{
            String concatLastTwoElement=result.get(result.size()-2).concat(result.get(result.size()-1));
            result.subList(result.size()-2,result.size()).clear();
            result.add(concatLastTwoElement);
            return result;
        }


    }

    static  int validateIndex(int start,int size){
        if(start<0){
            start=0;
        }else if(start > size-1){
            start=size-1;
        }
        return start;

    }
}
