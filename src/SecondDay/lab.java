package SecondDay;

import java.math.BigDecimal;
import java.util.Scanner;

public class lab {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        byte centuries = Byte.parseByte(scanner.nextLine());

        BigDecimal bD = new BigDecimal("52.5");
        BigDecimal f = bD.add(bD);
        System.out.println(f);
    }
}
