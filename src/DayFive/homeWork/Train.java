package DayFive.homeWork;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String inputWagon = reader.readLine();

        List<Integer> wagon = Arrays.stream(inputWagon.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        int wagonCapacity = Integer.parseInt(reader.readLine());

        String[] in = reader.readLine().split("\\s+");
        while (!in[0].equalsIgnoreCase("end")){
            if(in.length>1){
                if(in[0].equalsIgnoreCase("Add")){
                    wagon.add(Integer.parseInt(in[1]));

                }

            }else{
                for (int i = 0; i < wagon.size() ; i++) {
                    int entry = Integer.parseInt(in[0]);

                    if(wagon.get(i) + entry <= wagonCapacity){
                        wagon.set(i,wagon.get(i)+entry);
                        break;
                    }

                }

            }
            in = reader.readLine().split("\\s+");


        }
        String out =wagon.toString();
        out = out.replace(",","");
        out = out.replace("[","");
        out = out.replace("]","");
        System.out.println(out);

    }
}
