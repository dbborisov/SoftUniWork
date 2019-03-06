package DayThree.HomeWork;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob_04 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int rotations = Integer.parseInt(reader.readLine());
        String save = "";

        for (int i = 0; i < rotations; i++) {

                save = input[0];


            for (int j = 0; j <input.length-1 ; j++) {
                input[j]=input[j+1];
            }
            input[input.length -1] = save;



        }
        for (String s : input) {
            System.out.print(s + " " );
        }

        }

    }

