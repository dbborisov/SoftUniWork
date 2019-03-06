
package daySix.homework.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<VehicleCatalogue> car = new ArrayList<>();
//        List<VehicleCatalogue> truck = new ArrayList<>();

        String data = "";
        while (!"End".equals(data = scanner.nextLine())) {

            String[] vehicle = data.split("\\s+");

                VehicleCatalogue cars = new VehicleCatalogue(vehicle[0], vehicle[1], vehicle[2], Integer.parseInt(vehicle[3]));
                car.add(cars);

        }

        while (!"Close the Catalogue".equals(data=scanner.nextLine())){

                String finalModel  = data;

                car.stream().filter(e->e.getModel().equals(finalModel)).forEach(e->{
                    System.out.println(String.format("Type: %s\n" +
                                                     "Model: %s\n" +
                                                     "Color: %s\n" +
                                                     "Horsepower: %d",e.getType().toUpperCase().charAt(0)+e.getType().substring(1),e.getModel(),e.getColor(),e.getHpower()));
                                                     });


        }
        double sumCar =0;
        int carCount =0;
        double sumTruck =0;
        int truckCount = 0;



        for (VehicleCatalogue cars : car) {

            if(cars.getType().equals("car")){
                sumCar+=cars.getHpower();
                carCount++;

            }else{
                sumTruck+=cars.getHpower();
                truckCount++;
            }

        }

        double carAvereg= sumCar/ carCount ;
        double truckAvereg= sumTruck/ truckCount ;
        if(carCount==0){
            carAvereg =0.0;
        }
        if(truckCount== 0){
            truckAvereg=0.0;
        }
        System.out.println(String.format("Cars have average horsepower of: %.2f.",  carAvereg));
        System.out.println(String.format("Trucks have average horsepower of: %.2f.",truckAvereg));
    }


}
