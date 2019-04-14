package FinalExcam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in ="";
        Pattern patternName = Pattern.compile("^([\\!\\@\\?\\#\\$]*[A-Z]*[a-z]*[0-9]*)*\\=(?<num>[0-9]+)<<(?<code>[a-zA-Z0-9]*)");



        while (!"Last note".equals(in=scanner.nextLine())){

            Matcher matcherName = patternName.matcher(in);

            if(matcherName.find()){
              int lenghtKey =Integer.parseInt(  matcherName.group("num"));
              int code = matcherName.group("code").length();
              if(lenghtKey==code){
                  String name = in.split("=")[0].replaceAll("!","").replaceAll("@","")
                          .replaceAll("\\?","").replaceAll("#","").replaceAll("\\$","");
                  System.out.println("Coordinates found! " + name+ " -> " + matcherName.group("code") );
              }else{
                  System.out.println("Nothing found!");
              }

            }else{
                System.out.println("Nothing found!");
            }



        }
    }
}
//System.out.println("Nothing found!");