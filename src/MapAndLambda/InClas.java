package MapAndLambda;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class InClas {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String , Integer> phone = new HashMap<>();
        HashMap <String,String> test = new HashMap<>();// не са подредени но са много бързи.
        LinkedHashMap<String,String> test_2 =new LinkedHashMap<>(); // в реда в който бъдат запазени така ще се и принтират.
        TreeMap<String,String> test_3  = new TreeMap<>(); // подредени

        phone.put("Pesho",12345687);
        phone.put("Ivo",25455);
        phone.put("Gosho",12);
        System.out.println(phone);
       int  value =  phone.remove("Pesho");
        System.out.println(phone);
        System.out.println(value);

        if(!phone.containsKey("Dimo")){
            phone.put("Dimo",12);
        }
        System.out.println(phone);
        System.out.println(phone.get("Dimo"));


        phone.putIfAbsent("Slavi",10);// добавяя ако не съществува.

        System.out.println(phone);


//        List<String> copyOfMap = phone.values();
        test_3.put("Zoro","pesho");
        test_3.put("ironman","Tony Stark");
        test_3.put("Bony"," Stark");
        System.out.println(test_3);



    }
}
