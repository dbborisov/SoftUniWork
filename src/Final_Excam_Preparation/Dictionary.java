package Final_Excam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Map<String , List<String>> words = new LinkedHashMap<>();

        String[] in = scanner.nextLine().split(" \\| ");

        for (int i = 0; i < in.length ; i++) {

            String[] cmd = in[i].split("\\:\\s+");
            String word = cmd[0];
            String definition = cmd[1];
            if(!words.containsKey(word)){
                words.put(word, new ArrayList<>());
            }
            words.get(word).add(definition);
        }
        in = scanner.nextLine().split(" \\| ");
        for (int i = 0; i <in.length ; i++) {

            if(words.containsKey(in[i])){
                System.out.println(in[i]);
                words.get(in[i]).stream().sorted((e1,e2)->e2.length() - e1.length()).forEach(e -> {

                    System.out.println(String.format(" -%s",e));
                });
            }
        }

        if("List".equals(scanner.nextLine())){
           String list  = words.keySet().stream().sorted().collect(Collectors.joining(" "));
            System.out.println(list);
        }
    }
}
