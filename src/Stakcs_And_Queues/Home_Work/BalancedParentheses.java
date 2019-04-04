package Stakcs_And_Queues.Home_Work;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> openParenttheses = new ArrayDeque<>();
        String in = scanner.nextLine();

        int index = 0;

        if(in.length()%2!=0 ||(in.charAt(0)=='}'||in.charAt(0)==')'||in.charAt(0)==']')){
            System.out.println("NO");
            return;
        }

        for (int i = 0; i <in.length() ; i++) {
            if(in.charAt(i)!=')'&& in.charAt(i)!=']' && in.charAt(i)!='}'){
                openParenttheses.push(in.charAt(i)+"");

            }else{
                index = i;
                break;
            }

        }

        boolean isEquals = false;
        try {
            for (int i = index; i < in.length(); i++) {

                String a = openParenttheses.pop();
                String b = in.charAt(i) + "";
                if (a.equals("(") && !b.equals(")")) {
                    System.out.println("NO");
                    break;
                } else if (a.equals("[") && !b.equals("]")) {
                    System.out.println("NO");
                    break;
                } else if (a.equals("{") && !b.equals("}")) {
                    System.out.println("NO");
                    break;
                }

                isEquals = true;
            }
        }catch (Exception e){
            System.out.println("YES");
            return;
        }
        if(isEquals){
            System.out.println("YES");
        }
    }
}
