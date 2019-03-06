package daySix.homework.OpinionPoll;

import java.util.ArrayList;
import java.util.List;

public class Person {



    private  String name;
    private  int years;

   public Person(String name,int year){
       this.name = name;
       this.years =year;

   }
    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.getName(),this.getYears());
    }
}
