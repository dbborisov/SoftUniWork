package MapAndLambda;

import java.util.*;

public class CountRealNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" +")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> someMap = new TreeMap<>();

        for(double num : nums){
            if(!someMap.containsKey(num)){
                someMap.put(num,0);
            }
            someMap.put(num,someMap.get(num)+1);
        }
//        System.out.println(someMap);
        for (Map.Entry<Double,Integer> aDouble : someMap.entrySet()) {
            System.out.println(aDouble);

        }
    }
}
