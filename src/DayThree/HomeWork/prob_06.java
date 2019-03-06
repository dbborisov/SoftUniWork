package DayThree.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob_06 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] in = reader.readLine().split(" ");
        int [] num = new int [ in.length];
//        int index = 0;
        boolean isEquals = false;

        for (int i = 0; i <in.length ; i++) {
            num[i]=Integer.parseInt(in[i]);

        }
        for (int i = 0; i <num.length ; i++) {
            int sumRight =0;
            int sumLeft =0;
            for (int j = i+1; j <num.length ; j++) {
                sumRight+=num[j];

            }
            for (int j = i-1; j >=0 ; j--) {
                sumLeft+=num[j];

            }
            if(sumLeft==sumRight){
                System.out.println(i);
                isEquals=true;
                break;
            }else{
                isEquals=false;
            }


        }
        if(!isEquals){
            System.out.println("no");
        }

    }
}
