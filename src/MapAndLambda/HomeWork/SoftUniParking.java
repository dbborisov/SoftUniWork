package MapAndLambda.HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int entry = Integer.parseInt(scanner.nextLine());
        String[] input ;
        Map <String,String> user = new LinkedHashMap<>();


        for (int i = 0; i <entry ; i++) {
            input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String name = input[1];
            if(input.length==3) {

                String plate = input[2];


                if (command.equals("register") && !user.containsKey(name) && !user.containsValue(plate)) {
                    System.out.println(String.format("%s registered %s successfully", name, plate));
                    user.put(name, plate);
                } else if (user.containsKey(name) && command.equals("register")) {
                    System.out.println(String.format("ERROR: already registered with plate number %s", user.get(name)));

                }
            }else{


            if(command.equals("unregister")&&user.containsKey(name)){
                System.out.println(String.format("%s unregistered successfully",name));
                user.remove(name);

            }else if(command.equals("unregister")&&!user.containsKey(name)){
                System.out.println(String.format("ERROR: user %s not found",name));

            }

        }

        }

        user.entrySet().forEach(e->{
            System.out.println(String.format("%s => %s",e.getKey(),e.getValue()));
        });

    }
}
