package MapAndLambda;

import java.util.*;

public class problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entry  = Integer.parseInt(scanner.nextLine());

        Map<String , List<String>> resMap = new LinkedHashMap<>();


        for (int i = 0; i < entry; i++) {

            String key = scanner.nextLine();
            String value = scanner.nextLine();
            resMap.putIfAbsent(key,new ArrayList<>());
            resMap.get(key).add(value);
        }

        String pattern = "%s - %s";
        for (Map.Entry<String,List<String>> kvp : resMap.entrySet()){
            String key = kvp.getKey();
            String value = String.join(" ,",kvp.getKey());
            System.out.println(String.format(pattern,key,value));



        }
    }
}
