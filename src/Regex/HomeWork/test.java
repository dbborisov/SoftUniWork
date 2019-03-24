package Regex.HomeWork;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        StringBuilder b = new StringBuilder();
        int index = 0;
        int power = 0;

        while (index < a.length()) {

            if (a.charAt(index) != '>') {
                b.append(a.charAt(index));

            } else if (a.charAt(index) == '>' && index + 1 < a.length()) {
                int start = index + 1;
                int end = a.indexOf(">", index + 1);

                b.append(a.charAt(index));
                if ((a.charAt(index + 1) + "").matches("[0-9]") && end != -1 && Integer.parseInt(a.charAt(index+1)+"")<= end-start){
                    b.append(a.substring(start  + Integer.parseInt(a.charAt(index + 1) + ""), end));

                }else if((a.charAt(index + 1) + "").matches("[0-9]") && end != -1 && Integer.parseInt(a.charAt(index+1)+"")> end-start){
                    int blast =end-start;
                    power += Integer.parseInt(a.charAt(index+1)+"") -blast;
                    b.append(a.substring(start+1,end));

                } else if ((a.charAt(index + 1) + "").matches("[0-9]") && end == -1) {
                    end = a.length() - 1;
                    if(start+power + Integer.parseInt(a.charAt(index + 1) + "")<=end) {
                        b.append(a.substring(start + power + Integer.parseInt(a.charAt(index + 1) + ""), end));
                    }else{

                        break;
                    }
                } else {
                    b.append(a.substring(start, end));
                }
                index = end;
                continue;

            }
//            System.out.println(b);

            index++;
        }
        System.out.println(b);
    }
}
