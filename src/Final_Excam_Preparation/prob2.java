package Final_Excam_Preparation;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
        String dec ="";


        if(in.contains("a") || in.contains("b")|| in.contains("c")){
            System.out.println("This is not the book you are looking for.");
            return;
        }
        for (int i = 0; i < in.length(); i++) {

            dec += (char)(in.charAt(i)-3)+"";

        }
        String[] rep = scanner.nextLine().split(" ");
       dec = dec.replaceAll(rep[0],rep[1]);
        System.out.println(dec);


    }
}
