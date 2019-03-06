package DayThree;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condense = new int[nums.length - 1];


        while (nums.length != 1) {
            for (int i = 0; i < nums.length; i++) {

                if (i != nums.length - 1) {
                    condense[i] = nums[i] + nums[i + 1];

                }
            }
            nums = condense;

        }
        System.out.println(nums[0]);

    }
}
