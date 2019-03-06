package DayThree.HomeWork;

import java.util.Scanner;

public class Prob_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = Integer.parseInt(sc.nextLine());
        int sum =0;
        for (int i = 0; i < in ; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if(i<in-1) {
                System.out.print(num + " ");
            }else{
                System.out.println(num);
            }
            sum+=num;

        }

        System.out.println(sum);
    }

}
