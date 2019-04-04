package Stakcs_And_Queues.Home_Work;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] in = scanner.nextLine().split(" ");
        ArrayDeque<String> nums = new ArrayDeque<>();
        for (int i = 0; i <in.length ; i++) {
            nums.add(in[i]);
        }

            while (nums.size()!=0) {
                System.out.print(nums.pollLast()+" ");
            }

    }
}
