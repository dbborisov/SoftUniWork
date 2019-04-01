package Final_Excam_Preparation;

import java.util.*;

public class Vapor_Winter_Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] in = scanner.nextLine().split(",\\s+");
        Map<String, Double> games = new LinkedHashMap<>();
        List<String> dlc = new ArrayList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i].contains(":")) {
                String[] a = in[i].split(":");
                String gameName = a[0];
                String gameName2 = a[1];
                if(games.containsKey(gameName)) {
                    dlc.add(gameName);
                    dlc.add(gameName2);
                }
                if (games.containsKey(gameName)) {
                    Double currant = games.get(gameName) + games.get(gameName) * 0.2;
                    games.put(gameName, currant);
                }
            } else {
                String[] a = in[i].split("-");
                String gameName = a[0];
                double gamePrice = Double.parseDouble(a[1]);

                games.put(gameName, gamePrice);

            }

        }
        games.entrySet().stream().forEach(e1 -> {
            if (dlc.contains(e1.getKey().toString())) {
                e1.setValue(e1.getValue() - (e1.getValue() * 0.50));
            } else {
                e1.setValue(e1.getValue() - (e1.getValue() * 0.20));
            }
        });
        games.entrySet().stream().filter(e -> dlc.contains(e.getKey())).sorted((e1, e2) ->{

            int sum = Double.compare(e1.getValue(), e2.getValue());
            if(sum==0){
                sum =e2.getKey().compareTo(e1.getKey());
            }
            return sum;
        }).forEach(e -> {

            System.out.println(String.format("%s - %s - %.2f", e.getKey(), dlc.get(dlc.indexOf(e.getKey()) + 1), e.getValue()));

        });
        games.entrySet().stream().filter(e -> !dlc.contains(e.getKey())).sorted((e2, e1) ->{

           int sum = Double.compare(e1.getValue(), e2.getValue());
           if(sum==0){
               sum = e1.getKey().compareTo(e2.getKey());
           }
           return sum;
        }).forEach(e -> {

            System.out.println(String.format("%s - %.2f", e.getKey(), e.getValue()));

        });

    }
}
