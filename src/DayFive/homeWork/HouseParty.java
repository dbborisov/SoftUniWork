package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HouseParty {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int guest =  Integer.parseInt(reader.readLine());
        List<String> isComing = new ArrayList<>();
        List<String> isGoing = new ArrayList<>();


        for (int i = 0; i < guest; i++) {
            String  in = reader.readLine();
            if(!in.contains("not")){
               in = in.replace(" is going!","");
                if(isComing.contains(in)){
                    isGoing.add(in + " is already in the list!");

                }else{
                    isComing.add(in);
                }
            }else {
                in = in.replace(" is not going!","");
                if(isComing.contains(in)){
                    isComing.remove(in);

                }else{
                    isGoing.add(in + " is not in the list!");
                }
            }



        }
        for (String in:isGoing) {
            System.out.println(in);
        }
        for (String in :isComing) {
            System.out.println(in);

        }

//        System.out.println(isGoing.toString().replace(",","").replace("[","").replace("]",""));




    }
}
