package Stakcs_And_Queues.Home_Work;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> nums =new ArrayDeque<>();

//        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(nums::push);

        for (int i = 0; i < n ; i++) {

            int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                switch (input[0]){

                    case 1:
                        nums.push(input[1]);
                        break;
                    case 2:
                        nums.pop();
                        break;
                    case 3:
                        if(!nums.isEmpty()){
                            System.out.println(nums.stream().max(Integer::compareTo).get());
                        }else{
                            System.out.println("0");
                        }
                        break;


                }

        }
    }
}
