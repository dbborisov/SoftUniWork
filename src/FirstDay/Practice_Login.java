package FirstDay;

import java.util.Scanner;

public class Practice_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        int counter = 1;
        String userPass = "";
        for (int i = user.length() - 1; i >= 0; i--) {
            userPass += user.charAt(i);

        }

        while (true) {


            String userTry = scanner.nextLine();
            if (userTry.equals(userPass)) {
                System.out.printf("User %s logged in.%n", user);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            counter++;

            if (counter == 4){
                System.out.printf("User %s blocked!",user);
                break;
            }

        }


    }
}
