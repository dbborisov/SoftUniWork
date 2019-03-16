package MapAndLambda.HomeWork;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Shadowmourne = 0;//– requires 250 Shards;
        int Valanyr = 0;//– requires 250 Fragments;
        int Dragonwrath = 0;//– requires 250 Motes;

        Map<String, Integer> materials = new TreeMap<>();
        String[] text = scanner.nextLine().split("\\s+");

        Map<String, Integer> junc = new TreeMap<>();
        boolean flag = false;
        materials.put("fragments",0);
        materials.put("shards",0);
        materials.put("motes",0);


        while (true) {
            int materialCount = 0;
            String materialName = "";
            for (int i = 0; i < text.length; i += 2) {
                materialCount = Integer.parseInt(text[i]);
                materialName = text[i + 1].toLowerCase();
                if (materialName.equals("fragments") || materialName.equals("shards") || materialName.equals("motes")) {

                        materials.put(materialName, materials.get(materialName) + materialCount);
                        if (materials.get(materialName) >= 250) {
                            flag = true;
                            break;


                    }
                } else {

                    if (!junc.containsKey(materialName)) {
                        junc.put(materialName, materialCount);
                    } else {
                        junc.put(materialName, junc.get(materialName) + materialCount);

                    }

                }


            }
            if(flag){
                break;
            }


            text = scanner.nextLine().split("\\s+");

        }
        if (materials.containsKey("fragments")) {
            if (materials.get("fragments") >= 250) {
                System.out.println("Valanyr obtained!");
                materials.put("fragments", materials.get("fragments") - 250);

            }
        }
        if (materials.containsKey("shards")) {
            if (materials.get("shards") >= 250) {
                System.out.println("Shadowmourne obtained!");
                materials.put("shards", materials.get("shards") - 250);

            }
        }
        if (materials.containsKey("motes")) {
            if (materials.get("motes") >= 250) {
                System.out.println("Dragonwrath obtained!");
                materials.put("motes", materials.get("motes") - 250);

            }
        }

        materials.entrySet().stream().sorted((e1, e2) -> {
            int sort = Integer.compare(e2.getValue(), e1.getValue());
            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;

        }).forEach(e -> {
            System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
        });

//        materials.entrySet().forEach(e->{
//
//                System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
//
//        });
        junc.entrySet().forEach(e -> {
            System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
        });


    }
}
