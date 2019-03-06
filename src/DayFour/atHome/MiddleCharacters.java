package DayFour.atHome;

        import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if(input.length()%2==0){
            int num = input.length()/2;
            System.out.println(String.valueOf(input.charAt(num-1))+String.valueOf(input.charAt(num)));

        }else{
            System.out.println(input.charAt(((input.length()-1)/2)));
        }
    }
}
