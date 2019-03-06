package DayThree.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class prob_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = Integer.parseInt(reader.readLine());

        int num2= -1;


        for (int i = 0; i <nums.length ; i++) {

            for (int j = i+1; j <nums.length ; j++) {

                int sumIn = nums[i]+nums[j];
                if(sumIn==sum){
                    if(nums[j]!=num2) {

                        System.out.println(nums[i] + " " + nums[j]);
                        num2 = nums[j];
//                        break;
                    }

                }
            }
        }


        }
    }

