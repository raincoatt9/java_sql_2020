package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Justas :)
 */
public class numberUtils {
    public static double getCorrectNumber(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("ivedete bloga skaiciu , pakartokite !");
                scanner.nextLine();
            }
        }
    }

    public static double getCorrectNumber(Scanner sc, String number) {
        try {
           return Integer.parseInt(number);
        } catch(NumberFormatException e) {
            System.out.println("ivedete bloga skaiciu, pakartoite");
            return getCorrectNumber(sc);
        }
    }
}

