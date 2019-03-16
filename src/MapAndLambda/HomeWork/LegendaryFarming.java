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

        Map<String ,Integer> junc = new TreeMap<>();
        while (true) {
            int materialCount = 0;
            String materialName = "";
            for (int i = 0; i < text.length; i += 2) {
                materialCount = Integer.parseInt(text[i]);
                materialName = text[i + 1].toLowerCase();
                if(materialName.equals("fragments")||materialName.equals("shards")||materialName.equals("motes")) {

                    if (!materials.containsKey(materialName)) {
                        materials.put(materialName, materialCount);
                    } else {
                        materials.put(materialName, materials.get(materialName) + materialCount);

                    }
                }else{

                    if (!junc.containsKey(materialName)) {
                        junc.put(materialName, materialCount);
                    } else {
                        junc.put(materialName, junc.get(materialName) + materialCount);

                    }

                }

            }
            if(materials.containsKey("fragments")) {
                if (materials.get("fragments") >= 255) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") -250);
                    break;
                }
            }
            if(materials.containsKey("shards")){
                if (materials.get("shards") >= 255) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") -250);
                    break;
                }
            }
            if(materials.containsKey("motes")){
                if (materials.get("motes") >= 255) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") -250);
                    break;
                }
            }
            text = scanner.nextLine().split("\\s+");

        }

        materials.entrySet().forEach(e->{

                System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));

        });
        junc.entrySet().forEach(e->{
            System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
        });


    }
}
