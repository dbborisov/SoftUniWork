package excamePreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasList {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        List<String> kidNames = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        String command = "";

        while (!"Finished!".equals(command=scanner.nextLine())){

            String[] cmdlist =command.split(" ");
            if(cmdlist[0].equals("Bad")){
                if(!kidNames.contains(cmdlist[1])){
                    kidNames.add(0,cmdlist[1]);
                }

            }else if(cmdlist[0].equals("Good")){
                if(kidNames.contains(cmdlist[1])){
//                    int index = kidNames.indexOf(cmdlist[1]);
                    kidNames.remove(cmdlist[1]);
                }

            }else  if (cmdlist[0].equals("Rearrange")){
                if(kidNames.contains(cmdlist[1])){
//                    int index = kidNames.indexOf(cmdlist[1]);
                    kidNames.remove(cmdlist[1]);
                    kidNames.add(cmdlist[1]);
                }
            }else{

                if(kidNames.contains(cmdlist[1])){
                    int index = kidNames.indexOf(cmdlist[1]);

                    kidNames.set(index,cmdlist[2]);
                }
            }

        }
        System.out.println(kidNames.toString().replaceAll("[\\]\\[]",""));



    }
}
