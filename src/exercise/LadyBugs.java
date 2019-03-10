package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> indexSesOfBugs = Arrays.stream(scanner.nextLine().split(" +")).collect(Collectors.toList());
        String command = "";

        int[] fild = new int[n];
        for (int i = 0; i < indexSesOfBugs.size(); i++) {
            if (Integer.parseInt(indexSesOfBugs.get(i)) <= fild.length - 1 && Integer.parseInt(indexSesOfBugs.get(i)) > -1) {
                fild[Integer.parseInt(indexSesOfBugs.get(i))] = 1;

            }


        }

        while (!"end".equals(command = scanner.nextLine())) {
            List<String> action = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            if (Integer.parseInt(action.get(2)) < 0) {
                if (action.get(1).equals("left")) {
                    action.set(1, "right");
                    action.set(2, action.get(2).replace("-", ""));
                } else if (action.get(1).equals("right")) {
                    action.set(1, "left");
                    action.set(2, action.get(2).replace("-", ""));
                }

            }

            switch (action.get(1)) {
                case "right":
                    if (Integer.parseInt(action.get(0)) <= fild.length - 1 && Integer.parseInt(action.get(0)) > -1) {
                        if (fild[Integer.parseInt(action.get(0))] == 1) {
                            if (Integer.parseInt(action.get(2)) <= fild.length - 1 && Integer.parseInt(action.get(2)) > 0) {
                                if (fild[Integer.parseInt(action.get(0))] == 1) {
                                    fild[Integer.parseInt(action.get(0))] = 0;
                                    int setter = Integer.parseInt(action.get(2)) + Integer.parseInt(action.get(0));
                                    int power = Integer.parseInt(action.get(2));

                                    for (int i = Integer.parseInt(action.get(0)); i < fild.length; i++) {

                                        if (i == setter && fild[i] == 0) {
                                            fild[i] = 1;
                                            break;

                                        } else if (i == setter && fild[i] == 1) {
                                            if (setter + power <= fild.length) {
                                                setter = setter + power;
                                            } else {
                                                break;
                                            }

                                        }
                                    }
                                }

                            }
                        }
                    }

                    break;
                case "left":
                    if (Integer.parseInt(action.get(0)) <= fild.length - 1 && Integer.parseInt(action.get(0)) > -1) {
                        if (fild[Integer.parseInt(action.get(0))] == 1) {
                            if (Integer.parseInt(action.get(2)) <= fild.length - 1 && Integer.parseInt(action.get(2)) > 0) {
                                if (fild[Integer.parseInt(action.get(0))] == 1) {
                                    fild[Integer.parseInt(action.get(0))] = 0;
                                    int setter = Integer.parseInt(action.get(0)) - Integer.parseInt(action.get(2));
                                    int power = Integer.parseInt(action.get(2));
                                    for (int i = Integer.parseInt(action.get(0)); i > 0; i--) {

                                        if (i == setter && fild[i] == 0) {
                                            fild[i] = 1;
                                            break;

                                        } else if (i == setter && fild[i] == 1) {
                                            if (setter + power - i >= 0) {
                                                setter = setter + power;
                                            } else {
                                                break;
                                            }

                                        }
                                    }
                                }

                            }
                        }
                    }

                    break;

            }


        }
        String out = "";

        for (int i = 0; i < fild.length; i++) {

            out += fild[i] + " ";
        }
        System.out.println(out.trim());

    }
}
