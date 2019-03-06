package DayFive;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class demo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = new ArrayList<>();
        names.add("Asd");
        names.add("pesho");
        names.add("Asd");
        System.out.println(names);
        System.out.println(names.size());
        names.remove("Asd");
        System.out.println(names);
        System.out.println(names.hashCode());
        System.out.println(names.size());
       // names.sort();

        names.get(1);


    }

}
