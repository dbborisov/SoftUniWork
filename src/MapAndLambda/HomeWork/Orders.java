package MapAndLambda.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Orders {
    public static void main(String[] args)throws IOException {


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input  = "";

        LinkedHashMap<String, double[]> productsP = new LinkedHashMap<>();
//        LinkedHashMap<String, Double> productsQ = new LinkedHashMap<>();

        while (!"buy".equals(input=reader.readLine())){

            String[] element = input.split("\\s+");
            String productName = element[0];
            double productPrice = Double.parseDouble(element[1]);
            double productQuantity = Double.parseDouble(element[2]);
            double[] p = {productPrice,productQuantity};

            if(!productsP.containsKey(productName)){
                productsP.put(productName,p);
//                productsQ.put(productName,productQuantity);
            }else{
                double[] p2 =productsP.get(productName);
                double[] p3 = {p[0],p[1]+p2[1]};
                productsP.put(productName,p3);
//                productsQ.put(productName,productsQ.get(productsQ)+productQuantity);
            }

        }
        System.out.println();
        productsP.entrySet().forEach(e->{
            double[] p = e.getValue();
            double sum = p[0]*p[1];
            System.out.println(String.format("%s -> %.2f",e.getKey(),sum));
        });






    }
}
