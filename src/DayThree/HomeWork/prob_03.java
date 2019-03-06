package DayThree.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class prob_03 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 0; i <n ; i++) {

           String[] a = reader.readLine().split(" ");

           if(i % 2 == 0){
               first[i]=Integer.parseInt(a[0]);
               second[i]=Integer.parseInt(a[1]);

           }else{
               first[i]=Integer.parseInt(a[1]);
               second[i]=Integer.parseInt(a[0]);
           }
        }
        for (int i = 0; i <first.length ; i++) {
            System.out.print(first[i]+" ");
            if(i==n-1){
                System.out.println();
            }

        }
        for (int i = 0; i <second.length ; i++) {
            System.out.print(second[i]+" ");

        }

    }
}
