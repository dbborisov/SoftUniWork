package daySix.homework;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AMessage mess = new AMessage();
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <input ; i++) {
            System.out.print(mess.getMessage());

                System.out.println();

        }

    }
}


class AMessage {

    private  String[] phrases = {"Excellent product.",
            "Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product."};
    private  String[] events ={"Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!"};

    private  String[] author  ={"Diana",
            "Petya",
            "Stella",
            "Elena",
            "Katya",
            "Iva",
            "Annie",
            "Eva"};

    private String[] cities = {"Burgas",
            "Sofia",
            "Plovdiv",
            "Varna",
            "Ruse"};
    Random random = new Random();

    public String getMessage(){
        String message="";
        message+=this.phrases[random.nextInt(this.phrases.length-1)];
        message+=" " +this.events[random.nextInt(this.events.length-1)];
        message+=" "+this.author[random.nextInt(this.author.length-1)];
        message+=" - "+this.cities[random.nextInt(this.cities.length-1)];


        return message;
    }
}
