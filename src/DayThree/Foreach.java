package DayThree;

import java.util.Arrays;
import java.util.Scanner;

public class Foreach {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);


         int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

         int even = 0;
         int odd = 0;

        for (int i : arr) {
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        int sum = even-odd;
        System.out.println(sum);

}
}
