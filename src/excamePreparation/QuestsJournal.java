package excamePreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> input = Arrays.stream(reader.readLine()
                .split(", "))
                .collect(Collectors.toList());

        String command = "";

        while (!"Retire!".contains(command = reader.readLine())) {
            String[] some = command.split(" - ");

            if (command.contains("Start")) {

                if(!input.contains(some[1])){
                    input.add(some[1]);
                }

            } else if (command.contains("Complete")) {

                if(input.contains(some[1])){
                    input.remove(some[1]);
                }

            } else if (command.contains("Renew")) {
                if(input.contains(some[1])){
                    input.remove(some[1]);
                    input.add(some[1]);

                }

            }else{

                String[] side = some[1].split(":");

                if(input.contains(side[0])&& !input.contains(side[1])){
                    int index = input.indexOf(side[0]);
                    input.add(index+1,side[1]);
                }


            }

        }
        System.out.println(input.toString().replaceAll("[\\]\\[]",""));

    }
}
