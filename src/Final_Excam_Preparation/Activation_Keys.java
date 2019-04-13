package Final_Excam_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Activation_Keys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] code = scanner.nextLine().split("&");
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]{16,25})");

        List<String> ok = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            Matcher matcher = pattern.matcher(code[i]);
            String up = "";

            if (matcher.find()) {
                String normalCode = code[i].toUpperCase();
                for (int j = 0; j < normalCode.length(); j++) {
                    if (j % 4 == 0 && normalCode.length()==16) {
                        up = up + "-";
                    }else if(j % 5 == 0 && normalCode.length()==25){
                        up = up + "-";
                    }
                    if (normalCode.charAt(j) > '/' && normalCode.charAt(j) < ':') {
                        int swap = Integer.parseInt(normalCode.charAt(j) + "");
                        swap = 9 - swap;
//                        normalCode.replace(normalCode.charAt(j)+"",swap+"");
                        up += swap + "";
                        continue;
                    }

                    up += normalCode.charAt(j) + "";

                }
                up=up.substring(1);
                ok.add(up);
            }

        }
        System.out.println(ok.stream().collect(Collectors.joining(", ")));

    }
}
