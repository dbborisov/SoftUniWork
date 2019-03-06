package problemSolving;

import java.util.Scanner;

public class GreaterofTwoValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

//        System.out.println(first.compareTo(second));

        if (input.equals("int")) {

            int result = getMax(Integer.parseInt(first), Integer.parseInt(second));
            System.out.println(result);

        } else if (input.equals("char")) {

            int result = getMax(first.charAt(0), second.charAt(0));
            System.out.println((char) result);

        } else if (input.equals("String")) {

            String result = getMax(first, second);
            System.out.println(result);
        }

    }

    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else {
            return second;
        }

    }
}
