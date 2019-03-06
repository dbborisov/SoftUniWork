package DayFour;

public class demo {
    public static void hello(){
        System.out.println("Hello");
    }
    public static void sumArray(int[] num ){
        int sum =0;
        for (int i = 0; i <num.length ; i++) {
            sum+=num[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        hello();

        int [] numbers= {1,2,3};
        sumArray(numbers);


    }
}
