package Stakcs_And_Queues.Lection;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String in = "";

        ArrayDeque<String> usedURL = new ArrayDeque<>();

        while (!"Home".equals(in=scanner.nextLine())){

            if(!in.equals("back")){

                usedURL.push(in);
                System.out.println(usedURL.peek());

            }else  if( usedURL.size()<=1){
                System.out.println("no previous URLs");
            }else{
                usedURL.pop();
                System.out.println(usedURL.peek());
            }

        }
    }
}
