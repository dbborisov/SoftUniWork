package DayFive.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class ListOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> inputList = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        List<String> inCommand = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

        while (!inCommand.contains("End")) {

            if (inCommand.contains("Add")) {
                inputList.add(inCommand.get(1));

            } else if (inCommand.contains("Insert")) {
                if (Integer.parseInt(inCommand.get(2)) <= inputList.size() - 1 && Integer.parseInt(inCommand.get(2))>= 0) {
                    inputList.add(Integer.parseInt(inCommand.get(2)), inCommand.get(1));

                } else {
                    System.out.println("Invalid index");
                }

            } else if (inCommand.contains("Remove")) {
                if (Integer.parseInt(inCommand.get(1)) <= inputList.size() - 1 && Integer.parseInt(inCommand.get(1))>= 0) {
                    inputList.remove(Integer.parseInt(inCommand.get(1)));

                } else {
                    System.out.println("Invalid index");
                }

            } else if (inCommand.contains("Shift") && inCommand.contains("left")) {


                for (int i = 0; i < Integer.parseInt(inCommand.get(2)); i++) {
                    String toSwap = inputList.get(0);
                    inputList.add(toSwap);
                    inputList.remove(0);

                }

            } else if (inCommand.contains("Shift") && inCommand.contains("right")) {

                for (int i = 0; i < Integer.parseInt(inCommand.get(2)); i++) {
                    String toSwap = inputList.get(inputList.size()-1);
                    inputList.add(0,toSwap);
                    inputList.remove(inputList.size()-1);

                }


            }
            inCommand = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        }
        String result ="";
        for (int i = 0; i <inputList.size(); i++) {
            result += inputList.get(i)+" ";

        }
        System.out.println(result);
    }
}
