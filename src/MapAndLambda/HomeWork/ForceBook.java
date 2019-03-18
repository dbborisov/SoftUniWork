package MapAndLambda.HomeWork;

import java.util.*;
import java.util.stream.Collectors;

public class ForceBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String in = "";
        Map<String, Set<String>> forceBook = new TreeMap<>();

        while (!"Lumpawaroo".equals(in = scanner.nextLine())) {

            String force;
            String name;

            String[] com = in.split("\\s+\\->\\s+|\\s+\\|\\s+");

            if (in.contains("|")) {
                force = com[0];
                name = com[1];
                if (!forceBook.containsKey(force)) {
                    forceBook.put(force, new TreeSet<>());
//                    forceBook.get(force).add(name);
                }
                if(forceBook.entrySet().stream().noneMatch(e->e.getValue().contains(name))){
                        forceBook.get(force).add(name);
                }

                }else {
                    name = com[0];
                    force = com[1];

                        String finalName = name;
                        forceBook.forEach((key,val) -> {

                                val.remove(finalName);

                        });

                    if(!forceBook.containsKey(force)){
                    forceBook.put(force, new TreeSet<>());
                    forceBook.get(force).add(name);
                    System.out.println(name+" joins the "+force+" side!");
                }else {
//                    forceBook.put(force, new TreeSet<>());
                    System.out.println(name + " joins the " + force + " side!");
                    forceBook.get(force).add(name);
                }
                }


            }

        forceBook.entrySet().stream().sorted((e1,e2)->{
            int sort = Integer.compare(e2.getValue().size(),e1.getValue().size());

            if(sort==0){
                sort = e1.getKey().compareTo(e2.getKey());
            }

            return sort;
        }).filter(e->e.getValue().size()>0).forEach(e->{

                System.out.println(String.format("Side: %s, Members: %d",e.getKey(),e.getValue().size()));

                e.getValue().stream().forEach(u->{
                    System.out.println("! "+ u);
                });

        });
        }
    }



