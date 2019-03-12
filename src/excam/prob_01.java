package excam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob_01 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);


        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String commad = "";

        while (!"END".equals(commad=scanner.nextLine())){

            String[] cmd = commad.split("\\s+");

            if(cmd[0].equals("Change")){

                int index = list.indexOf(cmd[1]);
                if(index>-1){
                    list.set(index,cmd[2]);


                }

            }else if(cmd[0].equals("Hide")){

                int index = list.indexOf(cmd[1]);
                if(index>-1){
                    list.remove(index);
                }

            }else if(cmd[0].equals("Switch")){

                int index = list.indexOf(cmd[1]);
                int index2 = list.indexOf(cmd[2]);
                if(index>-1&&index2>-1){
                    list.set(index,cmd[2]);
                    list.set(index2,cmd[1]);

                }

            }else if(cmd[0].equals("Insert")){
                int index =Integer.parseInt(cmd[1]);
                if(index>-1 && index<=list.size()-1) {
                    list.add(index + 1, cmd[2]);
                }


            }else if(cmd[0].equals("Reverse")){

              list=list.stream().collect(Collectors.collectingAndThen(Collectors.toList(),strings ->{
                  Collections.reverse(strings);


                  return strings;
              }));
            }

            Collections.reverse(list);

        }


        System.out.println(list.toString().replaceAll("[\\[\\],]",""));



    }
}


