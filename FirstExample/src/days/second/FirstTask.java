package days.second;

/**
 *    Justas
 */

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstTask firstTask = new FirstTask();
        int selection = 0;

        while (selection != 5) {


            System.out.println("1.Apskaiciuoti staciojo trikampio plota \n2.Staciakampio plotas\n3.Kvadrato plotas\n4.Apskritimo plotas\n5.Baigti");

            selection = (int) numberUtils.getCorrectNumber(scanner);

            switch (selection) {
                case 1:
                    firstTask.countTriangle(scanner);
                    break;

                case 2:
                    firstTask.stacPlotas(scanner);
                    break;
                case 3:
                    firstTask.kvadPlotas(scanner);
                    break;
                case 4:
                    firstTask.apskrPlot(scanner);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Tokio veiksmo nera.");
            }

        }
    }

    private void countTriangle(Scanner scanner) {
        System.out.println("iveskite pirma skaiciu");
        int a = (int) numberUtils.getCorrectNumber(scanner);
        System.out.println("iveskite antra skaiciu");
        int b = (int) numberUtils.getCorrectNumber(scanner);

        System.out.println("trikampio plotas yra " + a * b / 2);
    }

    private void stacPlotas(Scanner scanner) {
        System.out.println("iveskite pirma skaiciu");
        int a = (int) numberUtils.getCorrectNumber(scanner);
        System.out.println("iveskite antra skaiciu");
        int b = (int) numberUtils.getCorrectNumber(scanner);

        System.out.println("staciakampio plotas yra " + a * b);
    }

    private void kvadPlotas(Scanner scanner) {
        System.out.println("iveskite skaiciu");
        int a = (int) numberUtils.getCorrectNumber(scanner);

        System.out.println("kvadrato plotas " + a * a);
    }

    private void apskrPlot(Scanner scanner) {
        System.out.println("iveskite spinduli");
        double r = numberUtils.getCorrectNumber(scanner);
        double kvad = Math.pow(r, 2);
        double pi = 3.1415;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("apskritimo plotas " + df.format (kvad * pi));
    }


}





