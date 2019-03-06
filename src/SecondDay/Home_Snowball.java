package SecondDay;

import java.util.Scanner;

public class Home_Snowball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int snowTime=0;
        int snowSnow=0;
        int snowQuality=0;

        double max =0;
        for (int i = 0; i <n ; i++) {

            int snowSn = Integer.parseInt(scanner.nextLine());
            int snowTi = Integer.parseInt(scanner.nextLine());
            int snowQu = Integer.parseInt(scanner.nextLine());

            double in = Math.pow((double)snowSn/snowTi,snowQu);

            if(max<in){
                snowQuality=snowQu;
                snowSnow = snowSn;
                snowTime = snowTi;

                max=in;
            }


        }
        System.out.printf("%d : %d = %.0f (%d)",snowSnow,snowTime,max,snowQuality);
    }
}
