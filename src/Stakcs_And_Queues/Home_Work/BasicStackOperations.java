package Stakcs_And_Queues.Home_Work;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> nums = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).limit(commands[0]).mapToInt(Integer::parseInt).forEach(nums::push);
        for (int i = 0; i <commands[1] ; i++) {
            nums.pop();
        }
        if(nums.contains(commands[2])){
            System.out.println("true");
        }else{
            if(!nums.isEmpty()) {
                System.out.println(nums.stream().min(Integer::compareTo).get());
            }else{
                System.out.println("0");
            }
        }
    }
}
