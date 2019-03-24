package Regex.HomeWork;

import java.util.Scanner;

public class String_Eplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String out = "";
        int index = 0;
        int nextSimb = 0;
        int control =0;
        while (index < input.length()) {

            char cha = input.charAt(index);

            if (cha == '>') {
                nextSimb = input.indexOf(('>'), index + 1);
                out += input.substring(control,index);
                if (nextSimb < input.length()&&nextSimb!= -1) {
                    String bomb = input.substring(index, nextSimb+1 );
                    if(bomb.length()>3){
                        int power = Integer.parseInt(bomb.charAt(1)+"");
                        if(bomb.length()>power){
                            String a =bomb;
                            for (int i =bomb.length()-2 ; i > 1  ; i--) {
                                if(power<=i){
                                    a= a.substring(0,i);
                                }
                                out+=a+">";

                            }
                        }
                    }

                    control=nextSimb;

                    System.out.println(bomb);
                }else if(nextSimb==-1){
                    out+= input.substring(index);

                }
            } else {
                index++;
                continue;
            }

            index++;


        }
        System.out.println(out);
    }
}
