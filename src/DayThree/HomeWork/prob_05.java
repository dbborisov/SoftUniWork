package DayThree.HomeWork;

import DayThree.Streem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class prob_05 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] in = reader.readLine().split(" ");

        int[] nums = new int[in.length] ;

        for (int i = 0; i <in.length ; i++) {
            nums[i]=Integer.parseInt(in[i]);


        }

        for (int i = 0; i <nums.length ; i++) {
            boolean isBiger = true;

            for (int j = i; j <nums.length ; j++) {
                if(j!=nums.length-1) {
                    if (nums[i] > nums[j + 1]) {
//                        System.out.print(nums[i] + " ");
                    }else{
                        isBiger =false;
                    }
                }

//                }else if(i == nums.length-1){
//                    System.out.print(nums[i]);
//                }
            }if(isBiger){
                System.out.print(nums[i] + " ");
            }


        }


    }
}
