package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data_Time {
    public static void main(String[] args) {

        System.out.println(LocalDate.now()+ " " + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));


        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
    }
}
