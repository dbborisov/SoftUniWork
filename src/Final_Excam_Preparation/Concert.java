package Final_Excam_Preparation;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in ="";

        LinkedHashMap<String, LinkedHashSet> concert = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> concertTime = new LinkedHashMap<>();


        while (!"start of concert".equals(in =scanner.nextLine())){

            String[] element = in.split("[;\\s+,\\s+] ");

            if(element[0].equals("Add")){
                String group = element[1];
                if(concert.containsKey(group)){
                    for (int i = 2; i <element.length ; i++) {
                        concert.get(group).add(element[i]);

                    }
                }else{
                    concert.put(group,new LinkedHashSet());
                    concertTime.put(group,0);
                    for (int i = 2; i < element.length ; i++) {
                        concert.get(group).add(element[i]);

                    }
                }


            }else {
                String group = element[1];
                if(concertTime.containsKey(group)) {
                    concertTime.put(group, concertTime.get(group)+Integer.parseInt(element[2]));
                }else {
                    concertTime.put(group,Integer.parseInt(element[2]));
                    concert.put(group,new LinkedHashSet());
                }

            }

        }
        String first = scanner.nextLine();
        System.out.println(String.format("Total time: %d",concertTime.values().stream().mapToInt(Integer::intValue).sum()));

        concertTime.entrySet().stream().sorted((e1,e2)->{
            int sort = e2.getValue().compareTo(e1.getValue());
            if(sort==0){
                sort =e1.getKey().compareTo(e2.getKey());

            }
            return  sort;
        }).forEach(e->{
            System.out.println(String.format("%s -> %s",e.getKey(),e.getValue()));
        });
        System.out.println(first);
        concert.get(first).stream().forEach(e->{
            System.out.println("=> "+e);
        });
    }
}
