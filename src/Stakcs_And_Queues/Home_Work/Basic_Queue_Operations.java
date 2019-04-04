package Stakcs_And_Queues.Home_Work;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Basic_Queue_Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] cmd = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> nums = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s")).limit(cmd[0]).forEach(e->nums.add(Integer.parseInt(e)));
        for (int i = 0; i <cmd[1] ; i++) {
            nums.pop();
        }
        if(nums.contains(cmd[2])){
            System.out.println(true);
        }else if(nums.isEmpty()){
            System.out.println("0");
        }else{
            System.out.println(nums.stream().min(Integer::compareTo).get());
        }

    }
}
