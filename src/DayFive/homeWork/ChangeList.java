package DayFive.homeWork;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class ChangeList {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Hello World".indexOf("W"));
        List<String> listInt = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

        List <String> manipulator = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

        while (!"end".equals(manipulator.get(0))){

            if(manipulator.get(0).equals("Delete")){
                List<String> finalManipulator = manipulator;
                listInt = listInt
                        .stream()
                        .filter((String e) -> !e.equals(finalManipulator.get(1)))
                        .collect(Collectors.toList());

            }else{
                if(Integer.parseInt(manipulator.get(2))<=listInt.size()-1) {
                    listInt.add(Integer.parseInt(manipulator.get(2)), manipulator.get(1));
                }
            }
            manipulator= Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        }

        System.out.println(listInt.toString().replaceAll("[\\[,\\]]",""));

    }
}
