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
}
