package Stakcs_And_Queues.Lection;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> sum = new ArrayDeque<>();
        String[] in =scanner.nextLine().split(" ");

        for (int i = 2; i <in.length ; i+=2) {

            if(i==2) {
                sum.push(Integer.parseInt(in[i - 2]));
            }
            if(in[i-1].equals("+")){
                sum.push(sum.pop()+Integer.parseInt(in[i]));
            }else{
                sum.push(sum.pop()-Integer.parseInt(in[i]));
            }

        }

        System.out.println(sum.pop());
    }
}
