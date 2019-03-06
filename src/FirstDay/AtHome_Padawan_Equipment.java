package FirstDay;

import java.util.Scanner;

public class AtHome_Padawan_Equipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var moneyHave = Double.parseDouble(scanner.nextLine());
        var student = Integer.parseInt(scanner.nextLine());
        var lightSaber = Double.parseDouble(scanner.nextLine());
        var robes = Double.parseDouble(scanner.nextLine());
        var belts = Double.parseDouble(scanner.nextLine());

       var allLightSaber=lightSaber*Math.ceil((student+(student*0.1)));
       var allBelt=0.0 ;
        for (int i = 0; i <=student ; i++) {
            if(i%6==0){

            }else{
                allBelt += belts;
            }

        }
        var sum = allBelt+allLightSaber+robes*student;

        if(sum <= moneyHave){
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.",Math.abs(moneyHave-sum));
        }

    }
}

