package Final_Excam_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ActivationKeys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split("&");

        Pattern pattern = Pattern.compile("(?:&)*([a-zA-Z0-9]{16,25})(?:&)*");
        List<String> ok = new ArrayList<>();
        for (int i = 0; i <in.length ; i++) {
            Matcher matcher = pattern.matcher(in[i]);
            if(matcher.find()){
                ok.add(in[i]);
            }

        }

        for (int i = 0; i <ok.size() ; i++) {
            String newOk = "";
            if(ok.get(i).length()==16){
                for (int j = 0; j <ok.get(i).length() ; j++) {
                    if(j%4==0){
                        newOk+="-";
                    }

                    newOk = getString(ok, i, newOk, j);
                }
            }else{
                for (int j = 0; j <ok.get(i).length() ; j++) {
                    if(j%5==0){
                        newOk+="-";
                    }
                    newOk = getString(ok, i, newOk, j);
                }
            }
            ok.set(i,newOk.substring(1).toUpperCase());

        }
        String out = ok.stream().collect(Collectors.joining(", "));
        System.out.println(out);

    }

    private static String getString(List<String> ok, int i, String newOk, int j) {
        if(ok.get(i).charAt(j)>=48&&ok.get(i).charAt(j)<=57){

            newOk+=(9 - Integer.parseInt(ok.get(i).charAt(j)+"")+"");
            return newOk;
        }
        newOk+=ok.get(i).charAt(j);
        return newOk;
    }
}
